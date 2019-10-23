package Nivel;

import java.awt.Point;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

//import static java.util.concurrent.TimeUnit.*;

import GameObject.GameObject;

import Hordas.Horda;
import Juego.Juego;
import Mapa.MapaLogico;

public class Nivel {
	private Horda [] hordas;
	
	private Juego juego;
	private MapaLogico mapaLogico;


	
	public Nivel(Juego juego, MapaLogico mapaLogico) {
		this.juego= juego;
		this.mapaLogico= mapaLogico;
		hordas= new Horda[3];
		hordas[0]= new Horda(this, mapaLogico, 10);
		hordas[1]= new Horda(this, mapaLogico, 15);
		hordas[2]= new Horda(this, mapaLogico, 20);
	}
	
	public void crearEnemigo(Horda horda) {
		GameObject g= horda.crearEnemigo();
		mapaLogico.entidadAAgregar(g, g.getX(), g.getY());
	}
	
	public void ejecutarHorda(Horda horda) {
		final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		
		final ScheduledFuture<?> crearHorda = 
	    scheduler.scheduleAtFixedRate(new Runnable() {
	    	 @Override
	    	 public void run() { crearEnemigo(horda); }
	     }, 0, 5, TimeUnit.SECONDS);
		
	     
	    scheduler.schedule(new Runnable() {public void run() { crearHorda.cancel(true); }
	    }, horda.getCantEnemigos()*5-5, TimeUnit.SECONDS);
	     

//
//	    	     final Runnable beeper = new Runnable() {
//	    	       public void run() { System.out.println("beep"); }
//	    	     };
//	    	     final ScheduledFuture<?> beeperHandle =
//	    	       scheduler.scheduleAtFixedRate(beeper, 10, 10, SECONDS);
//	    	     scheduler.schedule(new Runnable() {
//	    	       public void run() { horda.finalizarHorda(); }
//	    	     }, horda.getCantEnemigos()*5, SECONDS);

	
//			while(!horda.finalizarHorda()) {
//				
//					g= horda.crearEnemigo();
//					mapaLogico.entidadAAgregar(g, g.getX(), g.getY());
//					
//						
//			}	

	}
	
	public void ejecutarHordas() {
		final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		final AtomicInteger cont = new AtomicInteger(0);

		final ScheduledFuture<?> crearHordas = 
	    scheduler.scheduleAtFixedRate(new Runnable() {
	    	 @Override
	    	 public void run() { 
	    		 ejecutarHorda(hordas[cont.getAndIncrement()]);  //llamo al metodo con una posicion del arreglo cuyo contador luego incremento
	    		 if (cont.get()==3)
	    			 scheduler.shutdown();		//cuando el contador llega a tres, la repeticion para
	    	}
	     }, 5, hordas[cont.get()].getCantEnemigos()*5, TimeUnit.SECONDS);		
	}
	
	public void finalizarNivel() {
		//Si un enemigo llega a x entre 0 y 30 creo, se pierde el nivel
	}
}
