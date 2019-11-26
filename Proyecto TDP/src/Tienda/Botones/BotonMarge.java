package Tienda.Botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GameObject.Personajes.Torres.TorresDisparo.Marge;
import Tienda.TiendaLogica;

public class BotonMarge extends BotonComprar {
	
	
	public BotonMarge(String s, TiendaLogica tiendaLogica) {
		super(s, tiendaLogica, new Marge(tiendaLogica.getMapaLogico()));
		
	}

}