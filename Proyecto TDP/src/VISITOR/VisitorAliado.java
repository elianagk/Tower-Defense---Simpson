package VISITOR;

import Disparo.DisparoLogico;
import GameObject.Objeto;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;

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
	public void visitar(Objeto o) {
		// TODO Auto-generated method stub
		
	}



}
