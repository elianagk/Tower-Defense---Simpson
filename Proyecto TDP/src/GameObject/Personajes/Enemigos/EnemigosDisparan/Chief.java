package GameObject.Personajes.Enemigos.EnemigosDisparan;



import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Disparos.DisparoLogicoEnemigo;
import GameObject.Personajes.Disparos.DisparoLogicoTorre;
import GameObject.Personajes.Enemigos.EnemigoDisparo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.ChiefGrafico;
import Mapa.MapaLogico;
import State.StatePersonaje.PersonajeOcioso;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;

public class Chief extends EnemigoDisparo {
	
	public Chief(MapaLogico ml) {
		super(ml, new ChiefGrafico(), 150,300);
		velocidad= 6;
		visitor= new VisitorEnemigo(this);
		tiempo=18;
		contador=0;
		daño=50;
		estado=new PersonajeOcioso(this, backward_key);
	}
	
	@Override
	public boolean estaEnRango(GameObject g) {		
		return (g.getX()>=this.getX()-100 && g.getX()<=getX() && g.getY()==this.getY()); 
	}

	public GameObject clone() {
		return new Chief(mapaLogico);
	}	
	
}
