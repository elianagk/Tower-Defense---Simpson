package VISITOR;

import GameObject.Objeto;
import GameObject.Objetos.ObjetoConVida;
import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;
import GameObject.Personajes.Disparos.DisparoLogicoEnemigo;
import GameObject.Personajes.Disparos.DisparoLogicoTorre;
import State.StateJuego.Jugando;
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
		
	}

	@Override
	public void visitarDisparo(DisparoLogicoEnemigo e) {
		
	}

	@Override
	public void visitar(Objeto o) {
		
	}

	@Override
	public void visitar(ObjetoConVida o) {
		
	}
}
