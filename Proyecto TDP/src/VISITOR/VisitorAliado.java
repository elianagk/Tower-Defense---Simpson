package VISITOR;


import GameObject.Objeto;
import GameObject.Objetos.Magia;
import GameObject.Objetos.ObjetoConVida;
import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;
import GameObject.Personajes.Disparos.DisparoLogicoEnemigo;
import GameObject.Personajes.Disparos.DisparoLogicoTorre;

public class VisitorAliado extends Visitor {
	
	public VisitorAliado(Torre t) {
		mipersonaje=t;
	}

	@Override
	public void visitar(Enemigo e) {
		mipersonaje.atacar(e);		
	}

	@Override
	public void visitar(Torre t) {
		mipersonaje.accionar();		
	}

	@Override
	public void visitarDisparo(DisparoLogicoTorre e) {
		mipersonaje.accionar();		
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
