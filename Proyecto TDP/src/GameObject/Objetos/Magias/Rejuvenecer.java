package GameObject.Objetos.Magias;

import java.util.Random;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.Magia;
import GameObjectGrafico.ObjetoGrafico;
import GameObjectGrafico.ObjetosGraficos.MagiasGraficas.RejuvenecerGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorMagia;

public class Rejuvenecer extends Magia {
		protected int vida;
	

	public Rejuvenecer(MapaLogico mapaLogico) {
		super(mapaLogico, new RejuvenecerGrafico(mapaLogico));	//3°duracion seg
		visitor= new VisitorMagia(this);
		
		
	}



	@Override
	public void accionar(Personaje e) {
		e.setVida(e.getVida()+300);
		
		
	}


	@Override
	public void Aceptar(Visitor v) {
		v.visitar(this);
		
	}



	@Override
	public GameObject clone() {
		return new Rejuvenecer(mapaLogico);
	}



	@Override
	public void activar() {
		for(GameObject o: mapaLogico.getEntidades()) {
			o.Aceptar(visitor);
		}
		mapaLogico.entidadAEliminar(this);
		
	}


	

}
