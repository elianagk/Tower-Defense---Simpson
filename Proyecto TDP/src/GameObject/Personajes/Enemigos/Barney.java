package GameObject.Personajes.Enemigos;

import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.BarneyGrafico;

public class Barney extends Enemigo {
	
	public Barney() {
		miobjetografico= new BarneyGrafico("");
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
