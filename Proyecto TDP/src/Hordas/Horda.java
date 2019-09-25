package Hordas;

import Nivel.Nivel;

import java.awt.Point;
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
		Point p= new Point(900, 400);
		Apu apu= new Apu(mapaLogico);
		apu.setPosicion(p);
		return apu;
	}
	
	public boolean finalizarHorda( ) {
		
		return true;
	}
}
