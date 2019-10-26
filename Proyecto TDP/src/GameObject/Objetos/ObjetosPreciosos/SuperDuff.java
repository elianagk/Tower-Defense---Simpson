package GameObject.Objetos.ObjetosPreciosos;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.ObjetoPrecioso;
import GameObjectGrafico.ObjetosGraficos.ObjetosPreciososGraficos.SuperDuffGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorPrecioso;

public class SuperDuff extends ObjetoPrecioso {

	public SuperDuff(MapaLogico mapaLogico) {
		super(mapaLogico, new SuperDuffGrafico(), 200);	//3°vida
		visitor= new VisitorPrecioso(this);
		hilo= new DuffHilo(mapaLogico.getMapaGrafico(), miObjetoGrafico);
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accionar(Personaje c) {
		// TODO Auto-generated method stub
		
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

	@Override
	public void empezarHilo() {
		hilo.start();
		
	}
}
