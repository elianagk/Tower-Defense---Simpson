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

	}
	
	public GameObject clone() {
		return new Apu(mapaLogico);
	}

}
