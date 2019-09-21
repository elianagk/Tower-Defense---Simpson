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


public class Mapa  {
	private ArrayList<GameObject> entidades;
	private Jugador jugador;
	private MapaGrafico mapaGrafico;
	private int width, height;
	private TiendaLogica tienda;

	public Mapa (int width, int height) {
		entidades= new ArrayList<GameObject> ();
		jugador= new Jugador();
		this.width=width;
		this.height=height;
	}
	
	public Point getPosition(GameObject o){
		return o.getPosition();
	}
	
//	public agregarEntidad(GameObject o) 
	
	
	
	/**
	 * recorre la lista de personajes para chequear colisiones
	 * @param x coordenada x dentro del mapa, donde se va a chequear la colision
	 * @param y coordenada y dentro del mapa, donde se va a chequear la colision
	 */
//	public sinColisiones (int x, int y)
	
	/**
	 * remueve una entidad o del la lista de personajes y del mapa grafico
	 * @param o entidad a remover
	 */
//	public removerEntidad(GameObject o)
	
}

//Lista de personajes
//lista de enemigos y lista de aliados
//mover a los personajes
//cuando terminan las hordas????????????'
//PUEDOAVANZAR?
//lospersonajes deberian conocer el mapaa para poder avanazar :D
