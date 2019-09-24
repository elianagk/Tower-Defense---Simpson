package GameObject.Personajes.Torres;

import GameObject.GameObject;
import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.AbueloGrafico;
import VISITOR.Visitor;

public class Abuelo extends Torre {
	
	public Abuelo() {
		super(50, 100, 65, 1);
		miobjetografico = new AbueloGrafico("");
	}

	@Override
	public void atacar() {
		// gif atacando
		
	}
	
	public GameObject clone() {
		return new Abuelo();
	}

	@Override
	public void Aceptar(Visitor visitante) {
		// TODO Auto-generated method stub
		
	}

}
