package Enemigos;

import GameObject.Personaje;

public class Enemigo extends Personaje {
	
	protected int velocidad;
	protected int puntaje;
	protected int costo;
	
	
	
	
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
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	
	
	
	
	
}
