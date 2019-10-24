package VISITOR;

import Disparo.DisparoLogico;
import GameObject.Objeto;
import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;

public class VisitorEnemigo extends Visitor {
	
	
	public VisitorEnemigo(Enemigo e) {
		mipersonaje= e;
	}

	@Override
	public void visitar(Enemigo e) {
//		System.out.println(e.getX());
//		if (e.getX()>0) 
			mipersonaje.accionar();
//		else {
//			e.gameOver();
//			System.out.println("GAMEOVER");
//		}
	}

	@Override
	public void visitar(Torre t) {
		mipersonaje.atacar(t);
		
	}

	@Override
	public void visitar(ObjetoPrecioso o) {
		// TODO Auto-generated method stub
		
	}

	

}
