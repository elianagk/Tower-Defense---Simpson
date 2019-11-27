package GameObject.Personajes.Torres.TorresDisparo;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObject.Personajes.Disparos.DisparoLogicoTorre;
import GameObject.Personajes.Torres.TorreDisparo;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.BartGrafico;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.MargeGrafico;
import Mapa.MapaLogico;
import State.StatePersonaje.PersonajeOcioso;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;

public class Marge extends TorreDisparo {
	
	public Marge(MapaLogico mapaLogico) {
		super(mapaLogico, new MargeGrafico(), 400);
		visitor= new VisitorAliado(this);
		tiempo=12;
		contador=0;
		daño=65;
		costo=1000;
		estado=new PersonajeOcioso(this, still_key);
	}
	
	public GameObject clone() {
		return new Marge(mapaLogico);
	}


	
	

}
