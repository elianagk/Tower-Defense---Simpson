package VISITOR;

import GameObject.Objeto;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;
import GameObject.Personajes.Disparos.DisparoLogicoEnemigo;
import GameObject.Personajes.Disparos.DisparoLogicoTorre;
import Juego.Juego;

public class VisitorVictory extends Visitor{
	protected Juego juego;
	
	public VisitorVictory(Juego juego) {
		this.juego=juego;
	}
	
	@Override
	public void visitar(Enemigo e) {
		juego.hayEnemigos(true);
	}

	@Override
	public void visitar(Torre t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(Objeto o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitarDisparo(DisparoLogicoTorre e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitarDisparo(DisparoLogicoEnemigo e) {
		// TODO Auto-generated method stub
		
	}
	
}
