package Juego;

import java.awt.event.KeyEvent;
import java.util.Random;

import GRAFICA.DiseñoGeneral;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Enemigos.Apu;
import Jugador.Jugador;


public class Juego {
	
	private Enemigo enemigos[];
	private Jugador jugador;
	
	
	
	public Juego(DiseñoGeneral gui){
		enemigos = new Enemigo[1];
		
		
		
		
//		for(int i = 0; i < enemigos.length; i++){
//			Random r = new Random();
//			enemigos[i] = new Enemigo(10, r.nextInt(gui.getWidth() - 32), r.nextInt(gui.getHeight() - 32));
//			gui.add(malos[i].getGrafico());
//		}
		
		
		enemigos[0]= new Apu(10, gui.getX()+20, gui.getY()+20);
		gui.add(enemigos[0].getGrafico());
	}
	
	public void mover(){
		for(int i = 0; i < enemigos.length; i++){
			
			// Inteligencia de los malos
			Random r = new Random();
			
			int dir = r.nextInt(4);
			
			enemigos[i].mover(dir);
		}
	}
	
	

}
