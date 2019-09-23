package Hordas;

import Nivel.Nivel;
import GameObject.GameObject;
import GameObject.Personajes.Enemigos.*;
import Mapa.MapaLogico;

public abstract class Horda {
	protected Nivel nivel;
	protected MapaLogico mapa;
	protected int cantEnemigos;
	
	public Horda (Nivel nivel, MapaLogico mapa, int cantEnemigos) {
		this.mapa=mapa;
		this.nivel=nivel;
		this.cantEnemigos=cantEnemigos;
	}
	
	public abstract GameObject crearEnemigo() ;
	
	public boolean finalizarHorda( ) {
		
		return true;
	}
}
