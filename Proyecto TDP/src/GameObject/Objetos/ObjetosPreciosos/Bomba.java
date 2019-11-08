package GameObject.Objetos.ObjetosPreciosos;

import java.util.ArrayList;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Objetos.ObjetosPreciosos.Hilos.BombaHilo;
import GameObjectGrafico.GameObjectGrafico;
import GameObjectGrafico.ObjetoGrafico;
import GameObjectGrafico.ObjetosGraficos.ObjetosPreciososGraficos.BombaGrafica;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorPrecioso;

public class Bomba extends ObjetoPrecioso {

	public Bomba(MapaLogico mapaLogico) {
		super(mapaLogico, new BombaGrafica(mapaLogico));
		
		visitor= new VisitorPrecioso(this);
		costo=1000;
		
	}

	public  void empezarHilo() {
		hilo= new BombaHilo(mapaLogico, this);
		hilo.start();
	}

	@Override
	public void Aceptar(Visitor visitante) {
		visitante.visitar(this);
		
	}

	@Override
	public GameObject clone() {
		return new Bomba(mapaLogico);
	}

	



	@Override
	public void accionar() {
		ArrayList<GameObject> entidades=mapaLogico.getEntidades();
		for (GameObject e: entidades) {
			mapaLogico.entidadAEliminar(e);
		}
		
		
	}

	
	

	

}
