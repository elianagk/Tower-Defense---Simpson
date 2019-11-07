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
		
	}

	@Override
	public void accionar(GameObject o) {
		Personaje p= (Personaje) o;
		p.setVida(p.getVida()+50);
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
	
	
	public void terminarMagia() {
		mipersonaje.setVida(vida);
	}
	
	public void activar() {
		for(GameObject o: mapaLogico.getEntidades()) {
			o.Aceptar(visitor);
		}
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}

}
