package VISITOR;

import GameObject.Objeto;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;

public class VisitorEnemigo extends Visitor {
	
	public VisitorEnemigo(Enemigo e) {
		mipersonaje= e;
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
		// TODO Auto-generated method stub
		
	}

}
