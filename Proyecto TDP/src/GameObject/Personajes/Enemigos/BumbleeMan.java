package GameObject.Personajes.Enemigos;

import GameObject.GameObject;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.BumbleeManGrafico;

public class BumbleeMan extends Enemigo {
	
	public BumbleeMan(int velocidad, int x, int y) {
		miobjetografico= new BumbleeManGrafico("");
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
		return new BumbleeMan(velocidad, x, y);
	}

}
