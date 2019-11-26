package GameObject.Personajes.Torres.TorresDisparo;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObject.Personajes.Disparos.DisparoLogicoTorre;
import GameObject.Personajes.Torres.TorreDisparo;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.AbueloGrafico;

import Mapa.MapaLogico;
import State.StatePersonaje.PersonajeOcioso;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;
import VISITOR.VisitorEnemigo;

public class Abuelo extends TorreDisparo {
	protected int contador;
	
	public Abuelo(MapaLogico mapaLogico) {
		super(mapaLogico, new AbueloGrafico(), 300);
		visitor= new VisitorAliado(this);
		tiempo=20;
		contador=0;		
		daño=80;
		costo=1000;
		estado=new PersonajeOcioso(this, still_key);
	}
	
	public GameObject clone() {
		return new Abuelo(mapaLogico);
	}	
	
}
