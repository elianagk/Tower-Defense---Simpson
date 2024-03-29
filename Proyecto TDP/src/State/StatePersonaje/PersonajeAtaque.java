package State.StatePersonaje;

import GameObject.Personaje;

public class PersonajeAtaque extends StatePersonaje {
	protected Personaje atacando;
	protected StatePersonaje cambio;
	
	public PersonajeAtaque (Personaje e, Personaje atacando, String direccion, StatePersonaje cambio) {
		super(e, direccion);
		this.atacando=atacando;
		this.cambio=cambio;
	}
	
	@Override
	public void atacar(Personaje e) {
		if (miPersonaje.primerPersonajeMasCercano(e, atacando))
			atacando=e;
		if (atacando.getEsValido()) {
			if (miPersonaje.cambiarGrafico(e))
				miPersonaje.cambiarGrafico();
			miPersonaje.atacarPersonaje(e);
		}
		else
			miPersonaje.cambiarEstado(cambio);
	}
	
	@Override
	public void accionar() {
		if (!atacando.getEsValido()) {
			miPersonaje.cambiarEstado(cambio);
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
		//System.out.println("Ataque");
		miPersonaje.getGrafico().atacar();
		miPersonaje.getGrafico().setBounds(miPersonaje.getX(), miPersonaje.getY(), 100, 100);
	}
}
