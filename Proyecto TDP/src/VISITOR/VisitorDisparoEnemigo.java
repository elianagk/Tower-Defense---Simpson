package VISITOR;

import Disparo.DisparoLogicoEnemigo;
import Disparo.DisparoLogicoTorre;
import GameObject.Objeto;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;

public class VisitorDisparoEnemigo extends Visitor {
	
	public VisitorDisparoEnemigo(DisparoLogicoEnemigo e) {
		mipersonaje=e;
		
	}

	@Override
	public void visitar(Enemigo e) {
		mipersonaje.accionar();
		
	}

	@Override
	public void visitar(Torre t) {
		mipersonaje.atacar(t);
		
	}

	@Override
	public void visitar(Objeto o) {
		mipersonaje.accionar();
		
	}

	@Override
	public void visitarDisparo(DisparoLogicoTorre e) {
		mipersonaje.accionar();
		
	}

	@Override
	public void visitarDisparo(DisparoLogicoEnemigo e) {
		mipersonaje.accionar();
		
	}

}
