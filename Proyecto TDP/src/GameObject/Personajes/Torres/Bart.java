package GameObject.Personajes.Torres;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.BartGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;;

public class Bart extends Torre {
	
	public Bart(MapaLogico mapaLogico) {
		super(mapaLogico, new BartGrafico(),200);
		visitor= new VisitorAliado(this);	
		daño=40;
		costo=500;
	}
	
	
	
	
	public GameObject clone() {
		return new Bart(mapaLogico);
	}


}
