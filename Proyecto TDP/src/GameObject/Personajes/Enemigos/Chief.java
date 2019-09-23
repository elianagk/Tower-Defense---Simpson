package GameObject.Personajes.Enemigos;

import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.ChiefGrafico;

public class Chief extends Enemigo {
	
	public Chief() {
		miobjetografico= new ChiefGrafico("");
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
