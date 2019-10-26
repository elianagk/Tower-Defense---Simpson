package GameObject.Objetos.Magias;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.HiloAnimacionMagias;
import GameObject.Objetos.Magia;
import GameObjectGrafico.ObjetoGrafico;
import GameObjectGrafico.ObjetosGraficos.MagiasGraficas.RejuvenecerGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorMagia;

public class Rejuvenecer extends Magia {
		protected int vida;
	

	public Rejuvenecer(MapaLogico mapaLogico) {
		super(mapaLogico, new RejuvenecerGrafico(mapaLogico), 20);	//3°duracion seg
		visitor= new VisitorMagia(this);
		hilo= new RejuvenecerHilo(this);
		ObjetoGrafico o= (ObjetoGrafico) miObjetoGrafico;
		o.setEntidad(this);
	}

	@Override
	public void accionar(Personaje c) {
		mipersonaje=c;
		vida= mipersonaje.getVida();
		mipersonaje.setVida(mipersonaje.getVidaTotal());
		hilo.start();
		
		
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
	
	
	public void terminarMagia() {
		mipersonaje.setVida(vida);
	}
	
	
}
