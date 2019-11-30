package VISITOR;

import GameObject.Objeto;
import GameObject.Objetos.ObjetoConVida;
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
		
	}

	@Override
	public void visitar(Objeto o) {
		
	}

	@Override
	public void visitarDisparo(DisparoLogicoTorre e) {
		
	}

	@Override
	public void visitarDisparo(DisparoLogicoEnemigo e) {
		
	}
	
	@Override
	public void visitar(ObjetoConVida o) {
		
	}
	
}
