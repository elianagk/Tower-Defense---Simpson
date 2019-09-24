package GameObject.Personajes.Enemigos;

import java.awt.Point;

import GameObject.GameObject;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.BumbleeManGrafico;
import VISITOR.Visitor;

public class BumbleeMan extends Enemigo {
	
	public BumbleeMan(int velocidad, Point posicion) {
		miobjetografico= new BumbleeManGrafico("");
		this.velocidad= velocidad;
		position= posicion;
	}
	
	
	@Override
	public void avanzar() {
		//hilo de ejecucion avanzando con sus respectivas imagenes
	}

	@Override
	public void atacar() {
		// gif atacando
		
	}
	
	public GameObject clone() {
		return new BumbleeMan(velocidad, this.position);
	}


	@Override
	public void Aceptar(Visitor visitante) {
		// TODO Auto-generated method stub
		
	}

}
