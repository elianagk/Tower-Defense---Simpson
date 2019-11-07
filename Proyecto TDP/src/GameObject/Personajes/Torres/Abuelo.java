package GameObject.Personajes.Torres;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObject.Personajes.Disparos.DisparoLogicoTorre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.AbueloGrafico;

import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;
import VISITOR.VisitorEnemigo;

public class Abuelo extends Torre {
	protected int tiempo;
	protected int contador;
	
	public Abuelo(MapaLogico mapaLogico) {
		super(mapaLogico, new AbueloGrafico());
		visitor= new VisitorAliado(this);
		tiempo=20;
		contador=0;
		vida= 300;
		daño=95;
		costo=1000;
	}

	@Override
	public void atacar(Personaje e) {
		e.aplicarDaño(daño);
		accionar();
		
	}
	
	public GameObject clone() {
		return new Abuelo(mapaLogico);
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
