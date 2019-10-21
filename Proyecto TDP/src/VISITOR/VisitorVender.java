package VISITOR;

import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;
import Tienda.TiendaLogica;

public class VisitorVender extends Visitor {
	protected TiendaLogica tiendaLogica;
	
	public VisitorVender(TiendaLogica tienda) {
		this.tiendaLogica=tienda;
	}

	@Override
	public void visitar(Enemigo e) {

	}

	@Override
	public void visitar(Torre t) {
		tiendaLogica.vender(t);	
		tiendaLogica.getJuego().setJugar();
	}

	@Override
	public void visitar(ObjetoPrecioso o) {

	}

}
