package Juego;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;


import GRAFICA.MapaGrafico;

import GameObject.Personaje;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Enemigos.Apu;
import Jugador.Jugador;
import Mapa.MapaLogico;



public class Juego {
	
	private Enemigo enemigos[];
	private Jugador jugador;
	private MapaGrafico mapa;
	private MapaLogico mapalogico;
	private final int gravity_force = 5;
	private final int ground_position = 400;
	
	
	
	public Juego(MapaGrafico gui){
		enemigos = new Enemigo[1];
		mapa=gui;
		
//		for(int i = 0; i < enemigos.length; i++){
//			Random r = new Random();
//			enemigos[i] = new Enemigo(10, r.nextInt(gui.getWidth() - 32), r.nextInt(gui.getHeight() - 32));
//			gui.add(enemigos[i].getGrafico());
//		}
		Point posicion= new Point (gui.getX()+900, ground_position);
		
		enemigos[0]= new Apu(5, posicion);
		mapa.add(enemigos[0].getGrafico());
		mapa.repaint();
	}
	
	public void mover(){
		for(int i = 0; i < enemigos.length; i++){
			
			// Inteligencia de los enemigos
//			Random r = new Random();
//			
//			int dir = r.nextInt(4);
			
			
				enemigos[0].mover(Enemigo.backward_key);
			
		}
		//this.apply_gravity();
	}
	
	

}
