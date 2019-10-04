package GameObject.Personajes.Enemigos;

import java.awt.Point;

import javax.swing.JLabel;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.ApuGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import GameObject.GameObject;
import GameObject.Personaje;

public class Apu extends Enemigo {
	
	public Apu(MapaLogico ml) {
		super(ml, new ApuGrafico());
		vida= 100;
		velocidad= 5;
	}
	
	public JLabel getGrafico(){
		last_dir= still_key;
		return miObjetoGrafico;
		
	}
	
	
	@Override
	public void avanzar() {
		//hilo de ejecucion avanzando con sus respectivas imagenes
	}

	@Override
	public void atacar(Personaje e) {
		// gif atacando
		
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
		// TODO Auto-generated method stub
		return null;
	}

	
}
