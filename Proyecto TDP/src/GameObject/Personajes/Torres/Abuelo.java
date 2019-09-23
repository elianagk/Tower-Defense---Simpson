package GameObject.Personajes.Torres;

import GameObject.GameObject;
import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.AbueloGrafico;

public class Abuelo extends Torre {
	
	public Abuelo() {
		miobjetografico = new AbueloGrafico("");
	}

	@Override
	public void atacar() {
		// gif atacando
		
	}
	
	public GameObject clone() {
		return new Abuelo();
	}

}
