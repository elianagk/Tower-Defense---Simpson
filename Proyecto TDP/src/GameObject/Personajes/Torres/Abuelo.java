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
	protected int tiempo;
	protected int contador;
	
	public Abuelo(MapaLogico mapaLogico) {
		super(80, 100, 50, 1, mapaLogico, new AbueloGrafico());
		visitor= new VisitorAliado(this);
		tiempo=20;
		contador=0;
	}

	@Override
	public void atacar(Personaje e) {
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
