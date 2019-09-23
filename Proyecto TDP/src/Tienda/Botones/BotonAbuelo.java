package Tienda.Botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GameObject.Personajes.Torres.Abuelo;
import Tienda.TiendaLogica;

public class BotonAbuelo extends Boton {
	
	public BotonAbuelo(String s, TiendaLogica tienda) {
		super (s, tienda, new Abuelo());
	}

}
