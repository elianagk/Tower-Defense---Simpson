package GameObject.Objetos.ObjetosPreciosos;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Objetos.ObjetosPreciosos.Hilos.FuegoHilo;
import GameObject.Objetos.ObjetosPreciosos.Hilos.HiloAnimacionPrecioso;
import GameObjectGrafico.ObjetoGrafico;
import GameObjectGrafico.ObjetosGraficos.ObjetosPreciososGraficos.FuegoGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorPrecioso;

public class Fuego extends ObjetoPrecioso {
	
	

	public Fuego(MapaLogico mapaLogico) {
		super(mapaLogico, new FuegoGrafico(mapaLogico));	//3°vida
		visitor= new VisitorPrecioso(this);
		costo=500;
		
	}
	
	public  void empezarHilo() {
		hilo= new FuegoHilo(mapaLogico, this);
		hilo.start();
	}


	@Override
	public void Aceptar(Visitor visitante) {
		visitante.visitar(this);
		
	}
	
	public Fuego clone() {
		return new Fuego(mapaLogico);
	}

	

	
	
}
