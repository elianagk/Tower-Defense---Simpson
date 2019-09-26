package GameObject.Personajes.Enemigos;

import java.awt.Point;

import javax.swing.JLabel;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.ApuGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import GameObject.GameObject;

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
	public void atacar() {
		// gif atacando
		
	}
	
	public GameObject clone() {
		return new Apu(mapaLogico);
	}

	@Override
	public void Aceptar(Visitor visitante) {
		// TODO Auto-generated method stub
		
	}

	
}
