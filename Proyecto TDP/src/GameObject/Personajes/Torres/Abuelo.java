package GameObject.Personajes.Torres;

import javax.swing.JLabel;

import Disparo.DisparoLogicoTorre;
import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.AbueloGrafico;

import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;

public class Abuelo extends Torre {
	protected DisparoLogicoTorre disparo;
	protected int tiempo;
	protected int contador;
	
	public Abuelo(MapaLogico mapaLogico) {
		super(80, 30, 10, 1, mapaLogico, new AbueloGrafico());
		visitor= new VisitorAliado(this);
		disparo= new DisparoLogicoTorre(this.mapaLogico, this);
		tiempo=20;
		contador=0;
	}

	@Override
	public void atacar(Personaje e) {
		//miObjetoGrafico.atacar();
		//disparo.atacar(this);
		//e.aplicarDaño(daño);
		//EN REALIDAD EL Q ATACA ES EL DISPARO
		
	}
	
	@Override
	public JLabel getGrafico() {
		last_dir= still_key;
		return miObjetoGrafico;
	}
	
	public GameObject clone() {
		return new Abuelo(mapaLogico);
	}

	@Override
	public void Aceptar(Visitor v) {
		v.visitar(this);
		
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

	@Override
	public Visitor getVisitor() {
		return visitor;
	}

}
