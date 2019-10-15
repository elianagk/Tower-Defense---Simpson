package Tienda.Botones;

import Tienda.TiendaLogica;

import GameObject.Objeto;
import GameObject.Objetos.ObjetoPrecioso;
public class Premio extends Boton {

	public Premio(String s, TiendaLogica tiendaLogica) {
		super(s, tiendaLogica, new ObjetoPrecioso(tiendaLogica.getMapaLogico()));
		// TODO Auto-generated constructor stub
	}

}
