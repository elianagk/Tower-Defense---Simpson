package GameObject.Personajes.Enemigos;

import java.awt.Point;

import GameObject.GameObject;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.BarneyGrafico;

public class Barney extends Enemigo {
	
	
	public Barney(int velocidad, Point posicion) {
		position= posicion;
		miobjetografico= new BarneyGrafico("");
		this.velocidad= velocidad;
		
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
		return new Barney(velocidad, this.position);
	}

}
