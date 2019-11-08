package GameObject.Objetos.Magias;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.Magia;
import GameObjectGrafico.ObjetoGrafico;
import GameObjectGrafico.ObjetosGraficos.MagiaGrafico;
import GameObjectGrafico.ObjetosGraficos.MagiasGraficas.RejuvenecerGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorMagia;

public class Rejuvenecer extends Magia {
	protected int vida;
	private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();


	public Rejuvenecer(MapaLogico mapaLogico) {
		super(mapaLogico, new RejuvenecerGrafico(mapaLogico));	//3°duracion seg
		visitor= new VisitorMagia(this);
		((MagiaGrafico)miObjetoGrafico).setMagiaLogica(this);		
	}



	@Override
	public void accionar(Personaje e) {
		final ScheduledFuture<?> rejuvenecer= 
		scheduler.scheduleAtFixedRate(new Runnable() {
	    	 @Override
	    	 public void run() {
		    	if (e.getVidaTotal()>=e.getVida()+30)
		    		e.setVida(e.getVida()+30); 	    		
	    		else
	    			e.setVida(e.getVidaTotal());
	    	 }
	     }, 0, 1, TimeUnit.SECONDS);			    
	    
	    scheduler.schedule(new Runnable() {public void run() { rejuvenecer.cancel(true); }
	    }, 10, TimeUnit.SECONDS);					
	}

	@Override
	public void Aceptar(Visitor v) {
		v.visitar(this);
	}

	@Override
	public GameObject clone() {
		return new Rejuvenecer(mapaLogico);
	}

	@Override
	public void activar() {
		for(GameObject o: mapaLogico.getEntidades()) {
			o.Aceptar(visitor);
		}
		mapaLogico.entidadAEliminar(this);
		
	}


	

}
