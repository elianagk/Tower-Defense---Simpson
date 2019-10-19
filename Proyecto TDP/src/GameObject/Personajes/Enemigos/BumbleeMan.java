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
		da�o=60; //solo por ser abeja
	}
	
	public GameObject clone() {
		return new BumbleeMan(mapaLogico);
	}

}
