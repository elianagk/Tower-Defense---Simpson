package GameObject.Personajes.Enemigos.EnemigosCuerpo;

import java.awt.Point;

import javax.swing.JLabel;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Enemigos.EnemigoCuerpo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.ApuGrafico;
import Mapa.MapaLogico;
import State.StatePersonaje.PersonajeOcioso;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;
import GameObject.GameObject;
import GameObject.Personaje;

public class Apu extends EnemigoCuerpo {
	
	public Apu(MapaLogico ml) {
		super(ml, new ApuGrafico(), 400, 200);		
		velocidad= 5;
		visitor= new VisitorEnemigo(this);
		daño=30;
		estado=new PersonajeOcioso(this, backward_key);
	}
	
	public GameObject clone() {
		return new Apu(mapaLogico);
	}

}
