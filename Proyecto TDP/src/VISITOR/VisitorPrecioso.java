package VISITOR;

import Disparo.DisparoLogicoEnemigo;
import Disparo.DisparoLogicoTorre;
import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;

public class VisitorPrecioso extends Visitor {
	
	public VisitorPrecioso(ObjetoPrecioso o) {
		miobjeto=o;
	}

	@Override
	public void visitar(Enemigo e) {
		miobjeto.accionar(e);
		
	}

	@Override
	public void visitar(Torre t) {
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

	@Override
	public void visitar(ObjetoPrecioso o) {
		// TODO Auto-generated method stub
		
	}

}
