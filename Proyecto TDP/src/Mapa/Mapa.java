package Mapa;


import GameObject.*;
import GameObject.Personajes.*;
import GameObject.Personajes.Enemigos.*;
import GameObject.Personajes.Torres.*;
import java.util.ArrayList;
import Jugador.Jugador;
import java.awt.Point;

public class Mapa  {
	private ArrayList<Torre> torres;
	private ArrayList<Enemigo> enemigos;
	private Jugador jugador;
	private int width, height;
	

	public Mapa (int width, int height) {
		torres= new ArrayList<Torre> ();
		enemigos= new ArrayList<Enemigo> ();
		jugador= new Jugador();
		this.width=width;
		this.height=height;
	}

	public Position getPosition(GameObject o){
		return o.getPosition();
	}
	

}

//Lista de personajes
//lista de enemigos y lista de aliados
//mover a los personajes
//cuando terminan las hordas????????????'
//PUEDOAVANZAR?
//lospersonajes deberian conocer el mapaa para poder avanazar :D
