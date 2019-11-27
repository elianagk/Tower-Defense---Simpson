package State.StatePersonaje;

import GameObject.Personaje;

public class PersonajeAtaque extends StatePersonaje {
	protected Personaje atacando;
	
	public PersonajeAtaque (Personaje e, Personaje atacando, String direccion) {
		super(e, direccion);
		this.atacando=atacando;
	}
	
	@Override
	public void atacar(Personaje e) {
		if (atacando.getEsValido()) {
			if (miPersonaje.cambiarGrafico(e))
				miPersonaje.cambiarGrafico();
			miPersonaje.atacarPersonaje(e);
		}
		else
			miPersonaje.cambiarEstado(new PersonajeOcioso(miPersonaje, direccion));
	}
	
	@Override
	public void accionar() {
		if (!atacando.getEsValido()) {
			miPersonaje.cambiarEstado(new PersonajeOcioso(miPersonaje, direccion));
			miPersonaje.cambiarGrafico();
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
		System.out.println("Ataque");
		miPersonaje.getGrafico().atacar();
	}
}
