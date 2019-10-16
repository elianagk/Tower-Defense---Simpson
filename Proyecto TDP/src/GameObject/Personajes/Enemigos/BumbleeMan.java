package GameObject.Personajes.Enemigos;



import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;

import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.BumbleeManGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;

public class BumbleeMan extends Enemigo {
	
	public BumbleeMan(MapaLogico ml) {
		super(ml, new BumbleeManGrafico());
		vida= 100;
		velocidad= 8;
		visitor= new VisitorEnemigo(this);
		daño=60; //solo por ser abeja
		System.out.println("3");
	}
	
	
	@Override
	public JLabel getGrafico() {
		last_dir= still_key;
		return miObjetoGrafico;
	}

	@Override
	public void atacar(Personaje e) {
		miObjetoGrafico.atacar();
		e.aplicarDaño(daño);
		
	}
	
	public GameObject clone() {
		return new BumbleeMan(mapaLogico);
	}


	@Override
	public void Aceptar(Visitor v) {
		v.visitar(this);
		
	}

	


	@Override
	public void accionar() {
		super.mover(backward_key);
		
	}


	@Override
	public Visitor getVisitor() {
		return visitor;
	}

}
