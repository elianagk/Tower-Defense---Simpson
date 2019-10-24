package Mapa;


import GameObject.*;

import Juego.Juego;

import java.util.ArrayList;
import java.util.Iterator;

import Jugador.Jugador;
import State.State;
import Tienda.TiendaLogica;

import java.awt.Point;


import GRAFICA.MapaGrafico;
import java.util.ListIterator;

public class MapaLogico  {
	private ArrayList<GameObject> entidades, entidadesAAgregar, entidadesAEliminar;
	private Jugador jugador;
	private MapaGrafico mapaGrafico;
	private int width, height;
	private TiendaLogica tiendaLogica;
	


	public MapaLogico (int width, int height) {
		entidades= new ArrayList<GameObject> ();
		entidadesAAgregar= new ArrayList<GameObject> ();
		entidadesAEliminar= new ArrayList<GameObject> ();
		this.width=width;
		this.height=height;
		mapaGrafico=null;
		tiendaLogica=null;
		jugador=null;
	}
	
	public MapaGrafico getMapaGrafico() {
		return mapaGrafico;
	}
	
	public void setTiendaLogica(TiendaLogica tiendaLogica) {
		this.tiendaLogica=tiendaLogica;
	}
	
	public void setMapaGrafico(MapaGrafico m) {
		mapaGrafico= m;
	}
	
	public ArrayList<GameObject> hayEnElRango(GameObject g) {
		ArrayList<GameObject> toReturn = new ArrayList<GameObject>();
		Point posicion= g.getPosicion();
		for (GameObject e: entidades) {
			if (e.getX()+100==posicion.x  ) {
				toReturn.add(e);				
			}
			
		}
		return toReturn;	
		
	}
	
	public ArrayList<GameObject> getEntidades() {
		actualizarListaDeEntidades();
		ArrayList<GameObject> entidadesActualizada = (ArrayList<GameObject>) entidades.clone();
		return entidadesActualizada;
	}
	
	/**
	 * recorre la lista de personajes para chequear colisiones
	 * @param x coordenada x dentro del mapa, donde se va a chequear la colision
	 * @param y coordenada y dentro del mapa, donde se va a chequear la colision
	 * @return true si hay colisiones (no se puede agregar el objeto), false caso contrario
	 */
	public boolean HayColisiones (int x, int y) {
		boolean colisiones=false;
		ListIterator<GameObject> it= entidades.listIterator();
		GameObject o;
		while (!colisiones && it.hasNext()) {
			o=it.next(); 
			colisiones= (x!=o.getPosicion().x && y!=o.getPosicion().y);
		}
		
		
		return colisiones;
	}
	
	public void entidadAEliminar(GameObject o) {
		entidadesAEliminar.add(o);
	}
	
	/**
	 * remueve una entidad o del la lista de personajes y del mapa grafico
	 * @param o entidad a remover
	 */
	public void removerEntidad(GameObject o) {
		entidades.remove(o);
		mapaGrafico.removerEntidad(o);
	}
	
	public void entidadAAgregar(GameObject o, int x, int y) {
		Point p = new Point (x, y);
		//System.out.println("X: "+x+" - Y: "+y);
		o.setPosicion(p);
		entidadesAAgregar.add(o);
	}
	
	public void agregarEntidad(GameObject o) {
		
			entidades.add(o);
			mapaGrafico.agregarEntidad(o);
			
		}
	
	
	public void actualizarListaDeEntidades() {
		for (GameObject objEliminar : entidadesAEliminar) {
			removerEntidad(objEliminar);
		}
		
		for (GameObject objAgregar : entidadesAAgregar) {
			agregarEntidad(objAgregar);
		}
		
		
		entidadesAEliminar.clear();
		entidadesAAgregar.clear();
	}
	
	//Sirve para matar a apu desde un boton
	public Juego getJuego() {
		return mapaGrafico.getJuego();
	}
	
	
	
	public TiendaLogica getTiendaLogica() {
		return tiendaLogica;
	}
	
	public void gameOver() {
		entidadesAEliminar=(ArrayList<GameObject>) entidades.clone();
		entidadesAAgregar.clear();
		actualizarListaDeEntidades();
		mapaGrafico.gameOver();
		
	}
	
	public void victory() {
		
	}
}

