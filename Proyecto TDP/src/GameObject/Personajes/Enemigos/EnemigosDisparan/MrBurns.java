package GameObject.Personajes.Enemigos.EnemigosDisparan;


import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Disparos.DisparoLogicoEnemigo;
import GameObject.Personajes.Enemigos.EnemigoDisparo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.MrBurnsGrafico;
import Mapa.MapaLogico;
import State.StatePersonaje.PersonajeOcioso;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;

public class MrBurns extends EnemigoDisparo {
	
	public MrBurns(MapaLogico ml) {
		super(ml, new MrBurnsGrafico(), 1000,300);
		velocidad= 6;
		visitor= new VisitorEnemigo(this);
		tiempo=16;
		contador=0;
		daño=95;
		estado=new PersonajeOcioso(this, backward_key);
	}

	public GameObject clone() {
		return new MrBurns(mapaLogico);
	}
		
}
