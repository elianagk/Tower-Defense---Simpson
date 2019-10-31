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
		super(80, 100, 10, 1, mapaLogico, new BartGrafico());
		visitor= new VisitorAliado(this);
	}
	
	
	@Override
	public void atacar(Personaje e) {
		
			miObjetoGrafico.atacar();
			
			e.aplicarDaño(daño);
			
			
			
	}
	
	public GameObject clone() {
		return new Bart(mapaLogico);
	}



	


	@Override
	public void Aceptar(Visitor v) {
		v.visitar(this);
		
	}
	
}
