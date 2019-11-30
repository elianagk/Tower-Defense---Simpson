package VISITOR;

import GameObject.Objeto;
import GameObject.Objetos.ObjetoConVida;
import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;
import GameObject.Personajes.Disparos.DisparoLogicoEnemigo;
import GameObject.Personajes.Disparos.DisparoLogicoTorre;

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
		miobjeto.accionar(e);
		
	}

	@Override
	public void visitar(Objeto o) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void visitar(ObjetoConVida o) {
		
	}	

}
