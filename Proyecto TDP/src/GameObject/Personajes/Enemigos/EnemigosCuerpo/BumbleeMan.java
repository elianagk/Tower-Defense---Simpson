package GameObject.Personajes.Enemigos.EnemigosCuerpo;



import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Enemigos.EnemigoCuerpo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.BumbleeManGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;

public class BumbleeMan extends EnemigoCuerpo {
	
	public BumbleeMan(MapaLogico ml) {
		super(ml, new BumbleeManGrafico(), 650,200);		
		velocidad= 3;
		visitor= new VisitorEnemigo(this);
		daño=30; //solo por ser abeja
	}
	
	public GameObject clone() {
		return new BumbleeMan(mapaLogico);
	}

}
