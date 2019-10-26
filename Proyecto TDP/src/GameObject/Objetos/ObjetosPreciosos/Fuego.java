package GameObject.Objetos.ObjetosPreciosos;

import GameObject.Personaje;
import GameObject.Objetos.HiloAnimacionPrecioso;
import GameObject.Objetos.ObjetoPrecioso;
import GameObjectGrafico.ObjetosGraficos.ObjetosPreciososGraficos.DonaExplosivaGrafica;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorPrecioso;

public class Fuego extends ObjetoPrecioso {
	protected HiloAnimacionPrecioso hilo;
	

	public Fuego(MapaLogico mapaLogico) {
		super(mapaLogico, new DonaExplosivaGrafica(), 100);	//3�vida
		visitor= new VisitorPrecioso(this);
		hilo= new FuegoHilo(mapaLogico.getMapaGrafico(), miObjetoGrafico);
		//hilo.start();
		
		
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accionar(Personaje c) {
		c.aplicarDa�o(50);
		
	}

	@Override
	public void Aceptar(Visitor visitante) {
		visitante.visitar(this);
		
	}
	
	public Fuego clone() {
		return new Fuego(mapaLogico);
	}

	@Override
	public void empezarHilo() {
		hilo.start();
		
	}
}