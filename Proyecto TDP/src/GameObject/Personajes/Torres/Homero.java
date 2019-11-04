package GameObject.Personajes.Torres;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.BartGrafico;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.HomeroGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;

public class Homero extends Torre {
	
	public Homero(MapaLogico mapaLogico) {
		super(80, 150, 40, 1, mapaLogico, new HomeroGrafico());
		visitor= new VisitorAliado(this);
	}
	
	
	
	public GameObject clone() {
		return new Homero(mapaLogico);
	}
	
	

	

	
}
