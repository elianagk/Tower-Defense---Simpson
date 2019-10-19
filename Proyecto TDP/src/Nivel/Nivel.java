package Nivel;

import java.awt.Point;

import GameObject.GameObject;

import Hordas.Horda;
import Juego.Juego;
import Mapa.MapaLogico;

public class Nivel {
	private Horda horda;
	private Juego juego;
	private MapaLogico mapaLogico;
	


	
	public Nivel(Juego juego, MapaLogico mapaLogico) {
		this.juego= juego;
		this.mapaLogico= mapaLogico;
		horda= new Horda(this, mapaLogico, 100);
		
		
		
	}
	
	public void ejecutarHorda() {
		GameObject g=null;
		
		while(!horda.finalizarHorda()) {
			
				g= horda.crearEnemigo();
				mapaLogico.entidadAAgregar(g, g.getX(), g.getY());
			
						
		}	

	}
	
	public void ejecutarHordas() {
		ejecutarHorda();
	}
	
	public void finalizarNivel() {
		
	}
}
