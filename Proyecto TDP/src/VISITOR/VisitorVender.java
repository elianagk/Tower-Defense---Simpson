package VISITOR;

import Disparo.DisparoLogicoEnemigo;
import Disparo.DisparoLogicoTorre;
import GameObject.Objeto;
import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;
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
		tiendaLogica.getJuego().cambiarEstado(new Jugando(tiendaLogica.getJuego()));
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
