package GameObject.Personajes.Torres;

import GameObject.GameObject;
import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.MargeGrafico;

public class Marge extends Torre {
	
	public Marge() {
		miobjetografico = new MargeGrafico("");
	}
	
	
	@Override
	public void atacar() {
		// gif atacando
		
		
	}
	
	public GameObject clone() {
		return new Marge();
	}
	
}
