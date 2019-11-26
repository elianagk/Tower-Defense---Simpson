package GameObject.Personajes.Torres.TorresCuerpo;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObject.Personajes.Torres.TorreCuerpo;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.BartGrafico;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.HomeroGrafico;
import Mapa.MapaLogico;
import State.StatePersonaje.PersonajeOcioso;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;

public class Homero extends TorreCuerpo {
	
	public Homero(MapaLogico mapaLogico) {
		super(mapaLogico, new HomeroGrafico(),200);
		visitor= new VisitorAliado(this);		
		daño=50;
		costo=150;
		estado=new PersonajeOcioso(this, still_key);
	}
	
	public GameObject clone() {
		return new Homero(mapaLogico);
	}
		
}
