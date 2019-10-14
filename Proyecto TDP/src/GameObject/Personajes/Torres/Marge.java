package GameObject.Personajes.Torres;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.BartGrafico;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.MargeGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;

public class Marge extends Torre {
	
	public Marge(MapaLogico mapaLogico) {
		super(80, 30, 50, 1, mapaLogico, new MargeGrafico());
		visitor= new VisitorAliado(this);
	}
	
	
	@Override
	public void atacar(Personaje e) {
		miObjetoGrafico.atacar();
		e.aplicarDaño(daño);
		
		
	}
	
	@Override
	public JLabel getGrafico() {
		last_dir= still_key;
		return miObjetoGrafico;
	}
	
	public GameObject clone() {
		return new Marge(mapaLogico);
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
		super.mover(still_key);
		
	}


	@Override
	public Visitor getVisitor() {
		return visitor;
	}
	
}
