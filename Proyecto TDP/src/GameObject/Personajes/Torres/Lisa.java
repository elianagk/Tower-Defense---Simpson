package GameObject.Personajes.Torres;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.BartGrafico;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.LisaGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;

public class Lisa extends Torre {
	
	public Lisa(MapaLogico mapaLogico) {
		super(mapaLogico, new LisaGrafico(),200);
		visitor= new VisitorAliado(this);
		daño=30;
		costo=50;
	}
	
	
	
	
	public GameObject clone() {
		return new Lisa(mapaLogico);
	}

	

	



}
