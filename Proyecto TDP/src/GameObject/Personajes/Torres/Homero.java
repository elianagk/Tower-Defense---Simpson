package GameObject.Personajes.Torres;

import GameObject.GameObject;
import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.HomeroGrafico;

public class Homero extends Torre {
	
	public Homero() {
		miobjetografico= new HomeroGrafico("");
	}
	
	
	@Override
	public void atacar() {
		// gif atacando
		
	}

	public GameObject clone() {
		return new Homero();
	}
	
}
