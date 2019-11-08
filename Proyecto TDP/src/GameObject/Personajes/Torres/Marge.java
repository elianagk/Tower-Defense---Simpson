package GameObject.Personajes.Torres;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObject.Personajes.Disparos.DisparoLogicoTorre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.BartGrafico;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.MargeGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;

public class Marge extends Torre {
	private int tiempo;
	private int contador;
	
	public Marge(MapaLogico mapaLogico) {
		super(mapaLogico, new MargeGrafico());
		visitor= new VisitorAliado(this);
		tiempo=12;
		contador=0;
		vida= 300;
		daño=70;
		costo=1000;
	}
	
	
	@Override
	public void atacar(Personaje e) {
		accionar();				
	}
	
	public GameObject clone() {
		return new Marge(mapaLogico);
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
