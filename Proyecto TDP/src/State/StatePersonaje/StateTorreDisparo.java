package State.StatePersonaje;

import GameObject.Personaje;

public class StateTorreDisparo extends PersonajeOcioso {

	public StateTorreDisparo(Personaje e, String direccion) {
		super(e, direccion);
	}
	
	@Override
	public void accionar() {
		miPersonaje.atacarPersonaje(null);
	}
}
