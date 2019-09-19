package GameObject.Personajes.Enemigos;

import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.NedGrafico;

public class Ned extends Enemigo {
	
	public Ned() {
		miobjetografico= new NedGrafico();
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
