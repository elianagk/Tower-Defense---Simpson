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
		vida= 50;
		velocidad= 4;
		visitor= new VisitorEnemigo(this);
		daño=10;
	}
	
	public GameObject clone() {
		return new Barney(mapaLogico);
	}

}
