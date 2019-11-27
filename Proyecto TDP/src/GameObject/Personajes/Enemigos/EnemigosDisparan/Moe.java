package GameObject.Personajes.Enemigos.EnemigosDisparan;



import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Disparos.DisparoLogicoEnemigo;
import GameObject.Personajes.Enemigos.EnemigoDisparo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.MoeGrafico;
import Mapa.MapaLogico;
import State.StatePersonaje.PersonajeOcioso;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;

public class Moe extends EnemigoDisparo {		
	
	public Moe(MapaLogico ml) {
		super(ml, new MoeGrafico(), 550, 300);		
		velocidad= 6;
		visitor= new VisitorEnemigo(this);
		tiempo=20;
		contador=0;
		daño=25;
		estado=new PersonajeOcioso(this, backward_key);
	}

	public GameObject clone() {
		return new Moe(mapaLogico);
	}
	
}
