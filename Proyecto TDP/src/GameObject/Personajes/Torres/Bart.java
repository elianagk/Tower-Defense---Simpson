package GameObject.Personajes.Torres;

import GameObject.GameObject;
import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.BartGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;;

public class Bart extends Torre {
	
	public Bart(MapaLogico mapaLogico) {
		super(80, 30, 50, 1, mapaLogico, new BartGrafico());
	}
	
	
	@Override
	public void atacar() {
		// gif atacando
		
	}
	
	public GameObject clone() {
		return new Bart(mapaLogico);
	}


	@Override
	public void Aceptar(Visitor visitante) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void aplicarDaño(int daño) {
		// TODO Auto-generated method stub
		
	}
	
}
