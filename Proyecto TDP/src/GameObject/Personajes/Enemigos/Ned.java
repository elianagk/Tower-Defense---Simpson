package GameObject.Personajes.Enemigos;

import GameObject.GameObject;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.NedGrafico;

public class Ned extends Enemigo {
	
	public Ned(int velocidad, int x, int y) {
		miobjetografico= new NedGrafico("");
		this.velocidad= velocidad;
		this.x= x;
		this.y= y;
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
		return new Ned(velocidad, x, y);
	}
}
