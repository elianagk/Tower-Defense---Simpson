package VISITOR;

import Disparo.DisparoLogico;
import Disparo.DisparoLogicoEnemigo;
import Disparo.DisparoLogicoTorre;
import GameObject.Objeto;
import GameObject.Objetos.Magia;
import GameObject.Objetos.ObjetoPrecioso;
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
	public void visitarDisparo(DisparoLogicoTorre e) {
		mipersonaje.accionar();
		
	}

	@Override
	public void visitarDisparo(DisparoLogicoEnemigo e) {
		mipersonaje.accionar();
		
	}

	@Override
	public void visitar(Objeto o) {
		mipersonaje.accionar();
		
	}

	

}
