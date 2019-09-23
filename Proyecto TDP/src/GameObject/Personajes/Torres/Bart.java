package GameObject.Personajes.Torres;

import javax.swing.ImageIcon;

import GameObject.GameObject;
import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.BartGrafico;;

public class Bart extends Torre {
	
	public Bart() {
		miobjetografico = new BartGrafico("bartsinfondo.png");
	}
	
	
	@Override
	public void atacar() {
		// gif atacando
		
	}
	
	public GameObject clone() {
		return new Bart();
	}
	
}
