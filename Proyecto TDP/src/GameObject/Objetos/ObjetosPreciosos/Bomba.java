package GameObject.Objetos.ObjetosPreciosos;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.ObjetoPrecioso;
import GameObjectGrafico.GameObjectGrafico;
import GameObjectGrafico.ObjetoGrafico;
import GameObjectGrafico.ObjetosGraficos.ObjetosPreciososGraficos.BombaGrafica;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorPrecioso;

public class Bomba extends ObjetoPrecioso {

	public Bomba(MapaLogico mapaLogico) {
		super(mapaLogico, new BombaGrafica(mapaLogico), 100);
		hilo= new BombaHilo(mapaLogico.getMapaGrafico(), miObjetoGrafico);
		visitor= new VisitorPrecioso(this);
		ObjetoGrafico o= (ObjetoGrafico) miObjetoGrafico;
		o.setEntidad(this);
	}

	@Override
	public void empezarHilo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Aceptar(Visitor visitante) {
		visitante.visitar(this);
		
	}

	@Override
	public GameObject clone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accionar(Personaje c) {
		c.setVida(0);//los tiene q matar
		
	}

}
