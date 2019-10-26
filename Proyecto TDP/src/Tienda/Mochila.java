package Tienda;

import java.util.ArrayList;

import GameObject.Objeto;

public class Mochila {
	
	protected ArrayList<Objeto> premios;
	
	
	public Mochila() {
		premios= new ArrayList<Objeto>();
	}
	
	public void agregarPremio(Objeto o) {
		premios.add(o);
	}
	
	public void eliminarPremio(Objeto o) {
		premios.remove(o);
	}
	
	

}
