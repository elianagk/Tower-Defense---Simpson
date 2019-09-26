package Tienda.Botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GameObject.Personajes.Torres.Abuelo;
import GameObject.Personajes.Torres.Homero;
import Tienda.TiendaLogica;

public class BotonAbuelo extends Boton {
	
	public BotonAbuelo(String s, TiendaLogica tiendaLogica) {
		super(s, tiendaLogica, new Abuelo(tiendaLogica.getMapaLogico()));
		
	}

}
