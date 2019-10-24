package GameObject.Objetos.Magias;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.Magia;
import GameObjectGrafico.ObjetosGraficos.MagiasGraficas.RejuvenecerGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorMagia;

public class Rejuvenecer extends Magia {

	public Rejuvenecer(MapaLogico mapaLogico) {
		super(mapaLogico, new RejuvenecerGrafico(), 20);	//3°duracion seg
		visitor= new VisitorMagia(this);
	}

	@Override
	public void accionar(Personaje c) {
		c.setVida(c.getVidaTotal());
		mapaLogico.entidadAEliminar(this);
		
	}

	@Override
	public void Aceptar(Visitor visitante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GameObject clone() {
		// TODO Auto-generated method stub
		return null;
	}
}
