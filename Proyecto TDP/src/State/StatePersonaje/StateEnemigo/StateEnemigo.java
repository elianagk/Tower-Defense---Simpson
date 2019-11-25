package State.StatePersonaje.StateEnemigo;

import GameObject.Personaje;
import GameObject.Personajes.Enemigo;

public abstract class StateEnemigo {
	protected Enemigo miPersonaje;
	
	protected StateEnemigo(Enemigo e) {
		miPersonaje=e;
	}
	
	public abstract void atacar(Personaje e) ;
	
	public abstract void accionar() ;
}
