package Mapa;


import GameObject.*;
import GameObject.Objetos.Magia;
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
	private MapaGrafico mapaGrafico;
	private int width, height;
	private TiendaLogica tiendaLogica;
	private Juego juego;
	private Magia proxMagia;
	


	public MapaLogico (int width, int height) {
		entidades= new ArrayList<GameObject> ();
		entidadesAAgregar= new ArrayList<GameObject> ();
		entidadesAEliminar= new ArrayList<GameObject> ();
		this.width=width;
		this.height=height;
		tiendaLogica=null;
		
		
		
	}
	
	
	
	public void setTiendaLogica(TiendaLogica tiendaLogica) {
		this.tiendaLogica=tiendaLogica;
	}
	
	public void setMapaGrafico(MapaGrafico m) {
		mapaGrafico= m;
	}
	
	public MapaGrafico getMapaGrafico() {
		return mapaGrafico;
	}
	public ArrayList<GameObject> hayEnElRango(GameObject g) {
		ArrayList<GameObject> toReturn = new ArrayList<GameObject>();
		
		for (GameObject e: entidades) {
			if (e.estaEnRango(g)) {
				toReturn.add(e);				
			}
			
		}
		return toReturn;	
		
	}
	
	public ArrayList<GameObject> getEntidades() {
		ArrayList<GameObject> entidadesActualizada = actualizarListaDeEntidades();
		entidades= entidadesActualizada;
		return entidades;
	}
	
	
	
	public void entidadAEliminar(GameObject o) {
		entidadesAEliminar.add(o);
	}
	
	/**
	 * remueve una entidad o del la lista de personajes y del mapa grafico
	 * @param o entidad a remover
	 */
	public void removerEntidad(GameObject o, ArrayList<GameObject> lista) {
		lista.remove(o);
		mapaGrafico.removerEntidad(o);
	}
	
	public void entidadAAgregar(GameObject o, int x, int y) {
		Point p = new Point (x, y);
		//System.out.println("X: "+x+" - Y: "+y);
		o.setPosicion(p);
		entidadesAAgregar.add(o);
	}
	
	public void agregarEntidad(GameObject o, ArrayList<GameObject> lista) {
		
			lista.add(o);
			mapaGrafico.agregarEntidad(o);
			
		}
	
	
	public ArrayList<GameObject> actualizarListaDeEntidades() {
		ArrayList<GameObject> clon= (ArrayList<GameObject>) entidades.clone();
		for (GameObject objEliminar : entidadesAEliminar) {
			removerEntidad(objEliminar, clon);
		}
		
		for (GameObject objAgregar : entidadesAAgregar) {
			agregarEntidad(objAgregar, clon);
		}
		
		
		entidadesAEliminar.clear();
		entidadesAAgregar.clear();
		
		return clon;
	}
	
	public void setJuego(Juego j) {
		juego=j;
	}
	
	//Sirve para matar a apu desde un boton
	public Juego getJuego() {
		return juego;
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
	
	public void proximaMagia(Magia m) {
		proxMagia=m;
		
	}
	
	public Magia getProximaMagia() {
		return proxMagia;
	}
	
	
	
}

