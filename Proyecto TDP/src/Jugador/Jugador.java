package Jugador;

import javax.swing.ImageIcon;

import GameObject.GameObject;
import Tienda.Mochila;

public class Jugador  {

	protected String nombre;
	protected int puntaje, monedas;
	protected Mochila mochila;
	
	
	public Jugador () {
		puntaje=0;
		monedas=600;
		mochila= new Mochila();
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
	
	public Mochila getMochila(){
		return mochila;
	}
}
