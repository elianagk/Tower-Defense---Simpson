package GameObject.Personajes.Torres;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.BartGrafico;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.LisaGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;

public class Lisa extends Torre {
	
	public Lisa(MapaLogico mapaLogico) {
		super(80, 100, 10, 1, mapaLogico, new LisaGrafico());
		visitor= new VisitorAliado(this);
	}
	
	
	@Override
	public void atacar(Personaje e) {
		miObjetoGrafico.atacar();
		e.aplicarDaño(daño);
		
	}
	
	public GameObject clone() {
		return new Lisa(mapaLogico);
	}

	

	


	@Override
	public void Aceptar(Visitor v) {
		v.visitar(this);
		
	}

}
