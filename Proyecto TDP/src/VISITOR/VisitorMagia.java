package VISITOR;

import GameObject.Objeto;
import GameObject.Objetos.Magia;
import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;

public class VisitorMagia extends Visitor {
	
	public VisitorMagia(Magia o) {
		miobjeto=o;
	}

	@Override
	public void visitar(Enemigo e) {
		
		
	}

	@Override
	public void visitar(Torre t) {
		miobjeto.accionar(t);
		
	}

	@Override
	public void visitar(ObjetoPrecioso o) {
		
		
	}

}
