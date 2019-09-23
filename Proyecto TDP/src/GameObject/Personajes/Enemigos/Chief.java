package GameObject.Personajes.Enemigos;

import GameObject.GameObject;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.ChiefGrafico;

public class Chief extends Enemigo {
	
	public Chief(int velocidad, int x, int y) {
		miobjetografico= new ChiefGrafico("");
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
		return new Chief(velocidad, x, y);
	}
}
