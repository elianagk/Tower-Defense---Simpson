package Tienda.Botones;

import Tienda.TiendaLogica;

import GameObject.Objeto;
import GameObject.Objetos.Powerup;
public class Premio extends Boton {

	public Premio(String s, TiendaLogica tiendaLogica) {
		super(s, tiendaLogica, new Powerup(tiendaLogica.getMapaLogico()));
		// TODO Auto-generated constructor stub
	}

}
