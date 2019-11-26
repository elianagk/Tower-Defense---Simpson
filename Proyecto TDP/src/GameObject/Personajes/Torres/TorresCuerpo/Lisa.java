package GameObject.Personajes.Torres.TorresCuerpo;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObject.Personajes.Torres.TorreCuerpo;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.BartGrafico;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.LisaGrafico;
import Mapa.MapaLogico;
import State.StatePersonaje.PersonajeOcioso;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;

public class Lisa extends TorreCuerpo {
	
	public Lisa(MapaLogico mapaLogico) {
		super(mapaLogico, new LisaGrafico(),200);
		visitor= new VisitorAliado(this);
		daño=30;
		costo=50;
		estado=new PersonajeOcioso(this, still_key);
	}
	
	
	
	
	public GameObject clone() {
		return new Lisa(mapaLogico);
	}

	

	



}
