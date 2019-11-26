package State.StatePersonaje;

import GameObject.Personaje;
import GameObject.Personajes.Enemigo;

public abstract class StatePersonaje {
	protected Personaje miPersonaje;
	protected String direccion;
	
	protected StatePersonaje(Personaje e, String dir) {
		miPersonaje=e;
		direccion= dir;
	}
	
	public abstract void atacar(Personaje e) ;
	
	public abstract void accionar();
	
	public abstract void cambiarGrafico();
}
