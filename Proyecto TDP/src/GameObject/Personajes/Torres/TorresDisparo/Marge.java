package GameObject.Personajes.Torres.TorresDisparo;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personajes.Torres.TorreDisparo;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.MargeGrafico;
import Mapa.MapaLogico;
import State.StatePersonaje.StateTorreDisparo;
import VISITOR.VisitorAliado;

public class Marge extends TorreDisparo {
	
	public Marge(MapaLogico mapaLogico) {
		super(mapaLogico, new MargeGrafico(), 400);
		visitor= new VisitorAliado(this);
		tiempo=12;
		contador=0;
		daño=65;
		costo=800;
		estado=new StateTorreDisparo(this, still_key);
	}
	
	public GameObject clone() {
		return new Marge(mapaLogico);
	}


	
	

}
