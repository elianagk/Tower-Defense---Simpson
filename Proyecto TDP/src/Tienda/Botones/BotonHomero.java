package Tienda.Botones;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import GameObject.Personajes.Torres.TorresCuerpo.Homero;
import Tienda.TiendaLogica;

public class BotonHomero extends BotonComprar {
	
	
	public BotonHomero(String s, TiendaLogica tiendaLogica) {
		super(s, tiendaLogica, new Homero(tiendaLogica.getMapaLogico()));
		
	}

}
