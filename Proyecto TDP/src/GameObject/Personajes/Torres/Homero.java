package GameObject.Personajes.Torres;

import GameObject.GameObject;
import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.HomeroGrafico;
import VISITOR.Visitor;

public class Homero extends Torre {
	
	public Homero() {
		super(85, 70, 85, 1);
		miobjetografico= new HomeroGrafico("");
	}
	
	
	@Override
	public void atacar() {
		// gif atacando
		
	}

	public GameObject clone() {
		return new Homero();
	}


	@Override
	public void Aceptar(Visitor visitante) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void aplicarDaño(int daño) {
		// TODO Auto-generated method stub
		
	}
	
}
