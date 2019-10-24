package GameObject.Objetos.ObjetosPreciosos;

import GameObject.Personaje;
import GameObject.Objetos.HiloAnimacion;
import GameObject.Objetos.ObjetoPrecioso;
import GameObjectGrafico.ObjetosGraficos.ObjetosPreciososGraficos.DonaExplosivaGrafica;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorPrecioso;

public class DonaExplosiva extends ObjetoPrecioso {
	protected HiloAnimacion hilo;
	

	public DonaExplosiva(MapaLogico mapaLogico) {
		super(mapaLogico, new DonaExplosivaGrafica(), 100);	//3°vida
		visitor= new VisitorPrecioso(this);
//		hilo= new HiloAnimacion(mapaLogico.getMapaGrafico(), miObjetoGrafico);
//		hilo.start();
//		
		
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
	
	public DonaExplosiva clone() {
		return new DonaExplosiva(mapaLogico);
	}
}
