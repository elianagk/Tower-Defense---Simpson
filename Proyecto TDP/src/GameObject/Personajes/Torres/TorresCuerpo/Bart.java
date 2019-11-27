package GameObject.Personajes.Torres.TorresCuerpo;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObject.Personajes.Torres.TorreCuerpo;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.BartGrafico;
import Mapa.MapaLogico;
import State.StatePersonaje.PersonajeOcioso;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;;

public class Bart extends TorreCuerpo {
	
	public Bart(MapaLogico mapaLogico) {
		super(mapaLogico, new BartGrafico(),200);
		visitor= new VisitorAliado(this);	
		daño=40;
		costo=500;
		estado=new PersonajeOcioso(this, still_key);
	}
	
	public GameObject clone() {
		return new Bart(mapaLogico);
	}

}
