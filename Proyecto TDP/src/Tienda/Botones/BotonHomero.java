package Tienda.Botones;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import GameObject.Personajes.Torres.Homero;
import Tienda.TiendaLogica;

public class BotonHomero extends Boton {
	
	
	public BotonHomero(String s, TiendaLogica tienda) {
		super(s, tienda, new Homero());
	}

}
