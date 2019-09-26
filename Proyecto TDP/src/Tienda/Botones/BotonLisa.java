package Tienda.Botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GameObject.Personajes.Torres.Homero;
import GameObject.Personajes.Torres.Lisa;
import Tienda.TiendaLogica;

public class BotonLisa extends Boton {
	
	
	public BotonLisa(String s, TiendaLogica tiendaLogica) {
		super(s, tiendaLogica, new Lisa(tiendaLogica.getMapaLogico()));
		
	}

}