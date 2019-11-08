package VISITOR;

import GameObject.Objeto;
import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;
import GameObject.Personajes.Disparos.DisparoLogicoEnemigo;
import GameObject.Personajes.Disparos.DisparoLogicoTorre;
import State.Jugando;
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
	}

	

	@Override
	public void visitarDisparo(DisparoLogicoTorre e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitarDisparo(DisparoLogicoEnemigo e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(Objeto o) {
		// TODO Auto-generated method stub
		
	}

}
