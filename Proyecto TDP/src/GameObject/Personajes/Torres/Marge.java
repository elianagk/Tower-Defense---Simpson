package GameObject.Personajes.Torres;

import GameObject.GameObject;
import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.MargeGrafico;
import VISITOR.Visitor;

public class Marge extends Torre {
	
	public Marge() {
		super(75, 90, 20, 1);
		miobjetografico = new MargeGrafico("");
	}
	
	
	@Override
	public void atacar() {
		// gif atacando
		
		
	}
	
	public GameObject clone() {
		return new Marge();
	}


	@Override
	public void Aceptar(Visitor visitante) {
		// TODO Auto-generated method stub
		
	}
	
}
