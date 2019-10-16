package GameObject.Personajes.Enemigos;

import java.awt.Point;

import javax.swing.JLabel;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.ApuGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;
import GameObject.GameObject;
import GameObject.Personaje;

public class Apu extends Enemigo {
	
	public Apu(MapaLogico ml) {
		super(ml, new ApuGrafico());
		vida= 100;
		velocidad= 5;
		visitor= new VisitorEnemigo(this);
		daño=30;
		System.out.println("1");
	}
	
	public JLabel getGrafico(){
		last_dir= still_key;
		return miObjetoGrafico;
		
	}
	
	
	

	@Override
	public void atacar(Personaje e) {
		miObjetoGrafico.atacar();
		e.aplicarDaño(daño);
		
	}
	
	public GameObject clone() {
		return new Apu(mapaLogico);
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
		
		return visitor ;
	}

	
}
