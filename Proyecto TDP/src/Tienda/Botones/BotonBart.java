package Tienda.Botones;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import GameObject.Personajes.Torres.TorresCuerpo.Bart;
import Tienda.TiendaLogica;

public class BotonBart extends BotonComprar {
	
	public BotonBart(String s, TiendaLogica tiendaLogica) {
		super(s, tiendaLogica, new Bart(tiendaLogica.getMapaLogico()));
		
	}

}
