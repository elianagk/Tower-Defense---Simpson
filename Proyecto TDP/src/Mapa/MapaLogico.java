package Mapa;


import GameObject.*;
import GameObject.Personajes.*;
import GameObject.Personajes.Enemigos.*;
import GameObject.Personajes.Torres.*;
import java.util.ArrayList;
import Jugador.Jugador;
import Tienda.TiendaLogica;

import java.awt.Point;
import GRAFICA.MapaGrafico;
import java.util.ListIterator;

public class MapaLogico  {
	private ArrayList<GameObject> entidades;
	private Jugador jugador;
	private MapaGrafico mapaGrafico;
	private int width, height;
	private TiendaLogica tienda;

	public MapaLogico (int width, int height, MapaGrafico mapag) {
		entidades= new ArrayList<GameObject> ();
		jugador= new Jugador();
		this.width=width;
		this.height=height;
		mapaGrafico= mapag;
	}
	
	public void setMapaGrafico(MapaGrafico m) {
		mapaGrafico= m;
	}
	
	public void agregarEntidad(GameObject o, int x, int y) {
		o.setX(x);
		o.setY(y);
		entidades.add(o);
		mapaGrafico.agregarEntidad(o);		
	}
	
	
	
	/**
	 * recorre la lista de personajes para chequear colisiones
	 * @param x coordenada x dentro del mapa, donde se va a chequear la colision
	 * @param y coordenada y dentro del mapa, donde se va a chequear la colision
	 * @return true si hay colisiones (no se puede agregar el objeto), false caso contrario
	 */
	public boolean sinColisiones (int x, int y) {
		boolean colisiones=false;
		ListIterator<GameObject> it= entidades.listIterator();
		GameObject o;
		while (!colisiones && it.hasNext()) {
			o=it.next();
			colisiones= (x!=o.getX() && y!=o.getY());
		}
		
		
		return colisiones;
	}
	
	/**
	 * remueve una entidad o del la lista de personajes y del mapa grafico
	 * @param o entidad a remover
	 */
	public void removerEntidad(GameObject o) {
		entidades.remove(o);
		mapaGrafico.removerEntidad(o);
	}
	
}

//Lista de personajes
//lista de enemigos y lista de aliados
//mover a los personajes
//cuando terminan las hordas????????????'
//PUEDOAVANZAR?
//lospersonajes deberian conocer el mapaa para poder avanazar :D
