package Hordas;

import Nivel.Nivel;

import java.awt.Point;
import GameObject.GameObject;
import GameObject.Personajes.Enemigos.*;
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
		Point p= new Point(1080, 400);
		return new Apu(p, mapaLogico);
	}
	
	public boolean finalizarHorda( ) {
		
		return true;
	}
}
