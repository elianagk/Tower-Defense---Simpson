package Nivel;

import java.awt.Point;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;

import GameObject.GameObject;

import Hordas.Horda;
import Juego.Juego;
import Mapa.MapaLogico;

public class Nivel {
	private Horda horda;
	private Juego juego;
	private MapaLogico mapaLogico;


	
	public Nivel(Juego juego, MapaLogico mapaLogico) {
		this.juego= juego;
		this.mapaLogico= mapaLogico;
		horda= new Horda(this, mapaLogico, 100);
		
		
		
	}
	
	public void crearEnemigo() {
		GameObject g= horda.crearEnemigo();
		mapaLogico.entidadAAgregar(g, g.getX(), g.getY());
	}
	
	public void ejecutarHorda() {
		
		final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
//		final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
		
		final ScheduledFuture<?> crearHorda = 
	    scheduler.scheduleAtFixedRate(new Runnable() {
	    	 @Override
	    	 public void run() { crearEnemigo(); }
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
		ejecutarHorda();
	}
	
	public void finalizarNivel() {
		//Si un enemigo llega a x entre 0 y 30 creo, se pierde el nivel
	}
}
