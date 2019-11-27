package GameObject.Personajes.Enemigos.EnemigosCuerpo;



import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Enemigos.EnemigoCuerpo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.BarneyGrafico;
import Mapa.MapaLogico;
import State.StatePersonaje.PersonajeOcioso;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;

public class Barney extends EnemigoCuerpo {
	
	
	public Barney(MapaLogico ml) {
		super(ml, new BarneyGrafico(), 800, 200);		
		velocidad= 4;
		visitor= new VisitorEnemigo(this);
		daño=10;
		estado=new PersonajeOcioso(this, backward_key);
	}
	
	public GameObject clone() {
		return new Barney(mapaLogico);
	}

}
