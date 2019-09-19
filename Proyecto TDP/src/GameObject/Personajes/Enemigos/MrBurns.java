package GameObject.Personajes.Enemigos;

import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.MrBurnsGrafico;

public class MrBurns extends Enemigo {
	
	public MrBurns() {
		miobjetografico= new MrBurnsGrafico();
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
