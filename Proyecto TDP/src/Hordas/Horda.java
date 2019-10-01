package Hordas;

import Nivel.Nivel;

import java.awt.Point;
import java.util.Random;

import GameObject.GameObject;
import GameObject.Personajes.Enemigos.*;
import Juego.Juego;
import Mapa.MapaLogico;

public class Horda {
	protected Nivel nivel;
	protected MapaLogico mapaLogico;
	protected int cantEnemigos;
	
	
	public Horda (Nivel nivel, MapaLogico mapaL, int cantEnemigos) {
		this.mapaLogico=mapaL;
		this.nivel=nivel;
		this.cantEnemigos=cantEnemigos;
	}
	
	public GameObject crearEnemigo() {
		Random r = new Random();
		int n = r.nextInt(6);
		GameObject g = null;
		switch (n) {
		case 1: g= new Apu(mapaLogico); 
			break;	
		case 2:
			g= new Barney(mapaLogico);
			break;
			
		case 3:
			g= new BumbleeMan(mapaLogico);
			break;
			
		case 4:
			g= new Chief(mapaLogico);
			break;
			
		case 5:
			g= new MrBurns(mapaLogico);
			break;
			
		case 6:
			g= new Moe(mapaLogico);
			break;
			
			
		}
		
		crearEnemigo(g);
		
		return g;
		
	}
	
	private void crearEnemigo(GameObject g) {
		Point p= new Point(900, 400);
		g.setPosicion(p);
	}
	
	
	public boolean finalizarHorda( ) {
		
		return true;
	}
}
