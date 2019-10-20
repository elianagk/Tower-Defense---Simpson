package VISITOR;

import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;
import Tienda.TiendaLogica;

public class VisitorVender extends Visitor {
	protected TiendaLogica tienda;
	
	public VisitorVender(TiendaLogica tienda) {
		this.tienda=tienda;
	}

	@Override
	public void visitar(Enemigo e) {
		tienda.vender(e);
		
	}

	@Override
	public void visitar(Torre t) {
		tienda.vender(t);
		
	}

	@Override
	public void visitar(ObjetoPrecioso o) {
		tienda.vender(o);
		
	}

}
