package Hordas;

import Nivel.Nivel;
import GameObject.GameObject;
import GameObject.Personajes.Enemigos.*;
import Mapa.Mapa;

public abstract class Horda {
	protected Nivel nivel;
	protected Mapa mapa;
	protected int cantEnemigos;
	
	public Horda (Nivel nivel, Mapa mapa, int cantEnemigos) {
		this.mapa=mapa;
		this.nivel=nivel;
		this.cantEnemigos=cantEnemigos;
	}
	
	public abstract GameObject crearEnemigo() ;
	
	public boolean finalizarHorda( ) {
		
		return true;
	}
}
