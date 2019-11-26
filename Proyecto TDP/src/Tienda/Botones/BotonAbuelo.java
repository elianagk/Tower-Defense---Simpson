package Tienda.Botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GameObject.Personajes.Torres.TorresDisparo.Abuelo;
import Tienda.TiendaLogica;

public class BotonAbuelo extends BotonComprar {
	
	public BotonAbuelo(String s, TiendaLogica tiendaLogica) {
		super(s, tiendaLogica, new Abuelo(tiendaLogica.getMapaLogico()));
		
	}

}
