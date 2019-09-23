package Tienda.Botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GameObject.Personajes.Torres.Marge;
import Tienda.TiendaLogica;

public class BotonMarge extends Boton {
	
	
	public BotonMarge(String s, TiendaLogica tienda) {
		super(s, tienda, new Marge());
		
		
	}

}