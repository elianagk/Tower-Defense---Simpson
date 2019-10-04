package GameObject.Personajes.Torres;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.BartGrafico;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.LisaGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public class Lisa extends Torre {
	
	public Lisa(MapaLogico mapaLogico) {
		super(80, 30, 50, 1, mapaLogico, new LisaGrafico());
	}
	
	
	@Override
	public void atacar(Personaje e) {
		// gif atacando
		
	}

	public GameObject clone() {
		return new Lisa(mapaLogico);
	}


	@Override
	public void Aceptar(Visitor v) {
		v.visitar(this);
		
	}

	@Override
	public void aplicarDaño(int daño) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Visitor getVisitor() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
