package GameObject.Objetos.ObjetosPreciosos;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.ObjetoPrecioso;
import GameObjectGrafico.ObjetoGrafico;
import GameObjectGrafico.ObjetosGraficos.ObjetosPreciososGraficos.SuperDuffGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorPrecioso;

public class SuperDuff extends ObjetoPrecioso {

	public SuperDuff(MapaLogico mapaLogico) {
		super(mapaLogico, new SuperDuffGrafico(mapaLogico), 200);	//3°vida
		visitor= new VisitorPrecioso(this);
		hilo= new DuffHilo(mapaLogico, this);
		ObjetoGrafico o= (ObjetoGrafico) miObjetoGrafico;
		o.setEntidad(this);
		costo=100;
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
		return new SuperDuff(mapaLogico);
	}

	

	@Override
	public void activar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accionar(GameObject o) {
		// TODO Auto-generated method stub
		
	}
}
