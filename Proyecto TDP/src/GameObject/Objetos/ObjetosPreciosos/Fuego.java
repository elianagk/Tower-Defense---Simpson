package GameObject.Objetos.ObjetosPreciosos;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Objetos.ObjetosPreciosos.Hilos.FuegoHilo;
import GameObject.Objetos.ObjetosPreciosos.Hilos.HiloAnimacionPrecioso;
import GameObjectGrafico.ObjetoGrafico;
import GameObjectGrafico.ObjetosGraficos.ObjetosPreciososGraficos.DonaExplosivaGrafica;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorPrecioso;

public class Fuego extends ObjetoPrecioso {
	protected HiloAnimacionPrecioso hilo;
	

	public Fuego(MapaLogico mapaLogico) {
		super(mapaLogico, new DonaExplosivaGrafica(mapaLogico), 100);	//3°vida
		visitor= new VisitorPrecioso(this);
		costo=500;
		
	}
	
	public  void empezarHilo() {
		hilo= new FuegoHilo(mapaLogico, this);
		hilo.start();
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accionar(Personaje c) {
		c.aplicarDaño(50);
		
	}

	@Override
	public void Aceptar(Visitor visitante) {
		visitante.visitar(this);
		
	}
	
	public Fuego clone() {
		return new Fuego(mapaLogico);
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
