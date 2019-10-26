package Nivel;

import java.awt.Point;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import GameObject.GameObject;

import Hordas.Horda;
import Juego.Juego;
import Mapa.MapaLogico;

public class Nivel {
	private Horda [] hordas;
	
	private Juego juego;
	private MapaLogico mapaLogico;
	private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
	
	public Nivel(Juego juego, MapaLogico mapaLogico) {
		this.juego= juego;
		this.mapaLogico= mapaLogico;
		hordas= new Horda[3];
		hordas[0]= new Horda(this, mapaLogico, 15);
		hordas[1]= new Horda(this, mapaLogico, 20);
		hordas[2]= new Horda(this, mapaLogico, 25);
	}
	
	public void crearEnemigo(Horda horda) {
		GameObject g= horda.crearEnemigo();
		mapaLogico.entidadAAgregar(g, g.getX(), g.getY());
	}
	
	public void ejecutarHorda(Horda horda) {
		
		final ScheduledFuture<?> crearHorda = 
	    scheduler.scheduleAtFixedRate(new Runnable() {
	    	 @Override
	    	 public void run() { crearEnemigo(horda); }
	     }, 0, 5, TimeUnit.SECONDS);
		
	     
	    scheduler.schedule(new Runnable() {public void run() { crearHorda.cancel(true); }
	    }, horda.getCantEnemigos()*5-5, TimeUnit.SECONDS);
	}
	
	public void ejecutarHordas() {

		scheduler.schedule(new Runnable() {public void run() { ejecutarHorda(hordas[0]); }
	    }, 5, TimeUnit.SECONDS);
		
		
		scheduler.schedule(new Runnable() {public void run() { ejecutarHorda(hordas[1]);	 }
	    }, hordas[0].getCantEnemigos()*5+20, TimeUnit.SECONDS);
			
		
		scheduler.schedule(new Runnable() {public void run() { ejecutarHorda(hordas[2]); }
	    }, hordas[0].getCantEnemigos()*5+20+hordas[1].getCantEnemigos()*5+15, TimeUnit.SECONDS);
		
		
//	    scheduler.scheduleAtFixedRate(new Runnable() {
//	    	 @Override
//	    	 public void run() { 
//	    		 ejecutarHorda(hordas[cont.getAndIncrement()]);  //llamo al metodo con una posicion del arreglo cuyo contador luego incremento
//	    		 if (cont.get()==3)
//	    			 scheduler.shutdown();		//cuando el contador llega a tres, la repeticion para
//	    	}
//	     }, 5, hordas[cont.get()].getCantEnemigos()*5, TimeUnit.SECONDS);		
	}
	
	public void finalizarNivel() {
		//Si un enemigo llega a x entre 0 y 30 creo, se pierde el nivel
	}

	
	public void shutdown() {
		scheduler.shutdown();
	}
	
}

