package Jugador;

import javax.swing.ImageIcon;

import GameObject.GameObject;


public class Jugador  {

	protected String nombre;
	protected int puntaje, monedas;
	
	
	public Jugador () {
		puntaje=0;
		monedas=10000;
		
	}
	
	public void setNombre (String nombre) {
		this.nombre= nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	
	public void setPuntaje(int puntaje) {
		this.puntaje=puntaje;
	}
	
	public int getMonedas() {
		return monedas;
	}
	
	public void setMonedas(int monedas) {
		this.monedas=monedas;
	}
	
	
}
