package State.StatePersonaje;

import GameObject.Personaje;

public class PersonajeAtaque extends StatePersonaje {
	protected Personaje atacando;
	
	public PersonajeAtaque (Personaje e, Personaje atacando, String direccion) {
		super(e, direccion);
		this.atacando=atacando;
		miPersonaje.getGrafico().atacar();
		
	}
	
	@Override
	public void atacar(Personaje e) {
		if (atacando.getEsValido()) {
			miPersonaje.atacarPersonaje(e);
		}
		else
			miPersonaje.cambiarEstado(new EnemigoOcioso(miPersonaje, direccion));
	}
	
	@Override
	public void accionar() {
		if (!atacando.getEsValido()) {
			miPersonaje.cambiarEstado(new EnemigoOcioso(miPersonaje, direccion));			
		}
		else {
			if (miPersonaje.enContacto(atacando))
				miPersonaje.mover("Still");
			else
				miPersonaje.mover(direccion);
		}
		
			
	}
	
	@Override
	public void cambiarGrafico() {
		miPersonaje.getGrafico().accionar();
	}
}
