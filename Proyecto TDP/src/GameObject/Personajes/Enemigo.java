package GameObject.Personajes;

import java.awt.Point;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;

public abstract  class Enemigo extends Personaje {
	
	protected int puntaje;
	protected int monedas;
	
//	protected VisitorEnemigo visitor;
	
	
	public Enemigo(MapaLogico ml, GameObjectGrafico gog) {
		super(ml, gog);
		
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	public int getMonedas() {
		return monedas;
	}
	
	public void setMonedas(int monedas) {
		this.monedas = monedas;
	}
	
	@Override
	public void Aceptar(Visitor v) {
		v.visitar(this);
	}

	@Override
	public void accionar() {
		super.mover(backward_key);
	}
	
	public boolean estaEnRango(GameObject g) {
		return (g.getX()==posicion.x && g.getY()==posicion.y); 
	}

}
