package GameObject.Personajes.Enemigos;

import java.awt.Point;

import GameObject.GameObject;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.NedGrafico;

public class Ned extends Enemigo {
	
	public Ned(int velocidad, Point posicion) {
		miobjetografico= new NedGrafico("");
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
		return new Ned(velocidad, position);
	}
}
