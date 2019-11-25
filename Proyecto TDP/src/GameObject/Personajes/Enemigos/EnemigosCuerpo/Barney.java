package GameObject.Personajes.Enemigos.EnemigosCuerpo;



import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Enemigos.EnemigoCuerpo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.BarneyGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;

public class Barney extends EnemigoCuerpo {
	
	
	public Barney(MapaLogico ml) {
		super(ml, new BarneyGrafico(), 800, 200);		
		velocidad= 4;
		visitor= new VisitorEnemigo(this);
		daño=10;
	}
	
	public GameObject clone() {
		return new Barney(mapaLogico);
	}

}
