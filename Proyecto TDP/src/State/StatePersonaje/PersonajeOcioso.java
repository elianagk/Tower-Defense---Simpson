package State.StatePersonaje;

import GameObject.Personaje;

public class PersonajeOcioso extends StatePersonaje {

	public PersonajeOcioso(Personaje e,String direccion) {
		super(e, direccion);		
	}
	
	@Override
	public void atacar(Personaje e) {
		miPersonaje.cambiarEstado(new PersonajeAtaque(miPersonaje, e, direccion, this));
		miPersonaje.atacar(e);		
	}
	
	@Override
	public void accionar() {
		miPersonaje.mover(direccion);
	}
	
	@Override
	public void cambiarGrafico() {
		//System.out.println("Ocioso");
		miPersonaje.getGrafico().accionar();
		miPersonaje.getGrafico().setBounds(miPersonaje.getX(), miPersonaje.getY(), 100, 100);
	}
	
}
