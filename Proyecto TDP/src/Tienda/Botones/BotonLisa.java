package Tienda.Botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GameObject.Personajes.Torres.Lisa;
import Tienda.TiendaLogica;

public class BotonLisa extends Boton {
	
	
	public BotonLisa(String s, TiendaLogica tienda) {
		super(s, tienda, new Lisa());
		
		
	}

}