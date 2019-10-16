package GameObject.Personajes.Enemigos;



import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;

import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.BarneyGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;

public class Barney extends Enemigo {
	
	
	public Barney(MapaLogico ml) {
		super(ml, new BarneyGrafico());
		vida= 100;
		velocidad= 3;
		visitor= new VisitorEnemigo(this);
		daño=10;
		System.out.println("2");
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
		return new Barney(mapaLogico);
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
