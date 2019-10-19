package GameObject.Personajes.Torres;

import javax.swing.JLabel;

import Disparo.DisparoLogicoTorre;
import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.BartGrafico;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.MargeGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;

public class Marge extends Torre {
	private int tiempo;
	private int contador;
	
	public Marge(MapaLogico mapaLogico) {
		super(80, 30, 50, 1, mapaLogico, new MargeGrafico());
		visitor= new VisitorAliado(this);
		tiempo=12;
		contador=0;
	}
	
	
	@Override
	public void atacar(Personaje e) {
		accionar();
		
		
	}
	
	public GameObject clone() {
		return new Marge(mapaLogico);
	}

	@Override
	public void aplicarDaño(int daño) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void accionar() {
		miObjetoGrafico.atacar();
		contador++;
		if (contador==tiempo) {
			mapaLogico.entidadAAgregar(new DisparoLogicoTorre(mapaLogico, this), this.getX()+50, this.getY());
			contador=0;
		}
	}

}
