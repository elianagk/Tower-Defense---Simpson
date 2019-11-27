package VISITOR;


import GameObject.Objeto;
import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Objetos.ObjetosConVida.Maggie;
import GameObject.Objetos.ObjetosConVida.SuperDuff;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;
import GameObject.Personajes.Disparos.DisparoLogicoEnemigo;
import GameObject.Personajes.Disparos.DisparoLogicoTorre;
import GameObjectGrafico.ObjetosGraficos.ObjetosConVida.SuperDuffGrafico;

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

	public void visitar(SuperDuff s) {
		mipersonaje.atacar(s);
	}
	
	public void visitar(Maggie m) {
		mipersonaje.setVida(0);
		m.setVida(0);
	}
}
