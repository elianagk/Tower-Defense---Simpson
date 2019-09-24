package GameObject.Personajes.Torres;

import javax.swing.ImageIcon;

import GameObject.GameObject;
import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.BartGrafico;
import VISITOR.Visitor;;

public class Bart extends Torre {
	
	public Bart() {
		super(80, 30, 50, 1);
		
		miobjetografico = new BartGrafico("bartsinfondo.png");
	}
	
	
	@Override
	public void atacar() {
		// gif atacando
		
	}
	
	public GameObject clone() {
		return new Bart();
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
