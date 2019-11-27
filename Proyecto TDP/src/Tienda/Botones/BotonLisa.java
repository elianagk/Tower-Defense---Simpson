package Tienda.Botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GameObject.Personajes.Torres.TorresCuerpo.Lisa;
import Tienda.TiendaLogica;

public class BotonLisa extends BotonComprar {
	
	
	public BotonLisa(String s, TiendaLogica tiendaLogica) {
		super(s, tiendaLogica, new Lisa(tiendaLogica.getMapaLogico()));
		
	}

}