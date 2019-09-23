package GameObject.Personajes.Enemigos;

import GameObject.GameObject;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.MrBurnsGrafico;

public class MrBurns extends Enemigo {
	
	public MrBurns(int velocidad, int x, int y) {
		miobjetografico= new MrBurnsGrafico("");
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
		return new MrBurns(velocidad, x, y);
	}
}
