package GameObject.Personajes.Torres.TorresDisparo;

import javax.swing.JLabel;

import GameObject.GameObject;

import GameObject.Personajes.Torres.TorreDisparo;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.AbueloGrafico;

import Mapa.MapaLogico;
import State.StatePersonaje.StateTorreDisparo;
import VISITOR.VisitorAliado;

public class Abuelo extends TorreDisparo {
	protected int contador;
	
	public Abuelo(MapaLogico mapaLogico) {
		super(mapaLogico, new AbueloGrafico(), 300);
		visitor= new VisitorAliado(this);
		tiempo=20;
		contador=0;		
		daño=80;
		costo=700;
		estado=new StateTorreDisparo(this, still_key);	
	}
	
	public GameObject clone() {
		return new Abuelo(mapaLogico);
	}	
	
}
