package GameObject.Personajes.Torres;

import GameObject.GameObject;
import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.LisaGrafico;
import VISITOR.Visitor;

public class Lisa extends Torre {
	
	public Lisa() {
		super(90, 65, 30, 1);
		miobjetografico= new LisaGrafico("");
	}
	
	
	@Override
	public void atacar() {
		// gif atacando
		
	}

	public GameObject clone() {
		return new Lisa();
	}


	@Override
	public void Aceptar(Visitor visitante) {
		// TODO Auto-generated method stub
		
	}
	
}
