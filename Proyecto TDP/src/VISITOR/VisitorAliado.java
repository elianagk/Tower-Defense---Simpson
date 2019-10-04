package VISITOR;

import GameObject.Objeto;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;

public class VisitorAliado extends Visitor {
	
	public VisitorAliado(Torre t) {
		mipersonaje=t;
	}

	@Override
	public void visitar(Enemigo e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(Torre t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(Objeto o) {
		// TODO Auto-generated method stub
		
	}

}
