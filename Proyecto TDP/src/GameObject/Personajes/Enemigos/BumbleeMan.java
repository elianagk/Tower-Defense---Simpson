package GameObject.Personajes.Enemigos;

import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.BumbleeManGrafico;

public class BumbleeMan extends Enemigo {
	
	public BumbleeMan() {
		miobjetografico= new BumbleeManGrafico("");
	}
	
	
	@Override
	public void avanzar() {
		//hilo de ejecucion avanzando con sus respectivas imagenes
	}

	@Override
	public void atacar() {
		// gif atacando
		
	}

}
