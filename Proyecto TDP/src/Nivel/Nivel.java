package Nivel;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
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
	private Horda hordaActual;
	private Juego juego;
	private MapaLogico mapaLogico;
	private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
	
	public Nivel(Juego juego, MapaLogico mapaLogico, int enemigosAñadidos) {
		this.juego= juego;
		this.mapaLogico= mapaLogico;
		hordas= new Horda[3];
		hordas[0]= new Horda(this, mapaLogico, 1+enemigosAñadidos);
		hordaActual= hordas[0];
		hordas[1]= new Horda(this, mapaLogico, 2+enemigosAñadidos);
		hordas[2]= new Horda(this, mapaLogico, 3+enemigosAñadidos);
	}
	
	public void crearEnemigo(Horda horda) {
		GameObject g= horda.crearEnemigo();
		mapaLogico.entidadAAgregar(g, g.getX(), g.getY());
	}
	
	public int tiempoSegundos() {
		return hordas[0].getCantEnemigos()*5+20+hordas[1].getCantEnemigos()*5+15+hordas[2].getCantEnemigos()*5;
	}
	
	public void ejecutarHorda(Horda horda) {
		int cantEnemigos=horda.getCantEnemigos();
		int tiempo= cantEnemigos*5-5;
		
		final ScheduledFuture<?> crearHorda = 
	    scheduler.scheduleAtFixedRate(new Runnable() {
	    	 @Override
	    	 public void run() { crearEnemigo(horda); }
	     }, 0, 5, TimeUnit.SECONDS);
		
	    if (cantEnemigos==0)
	    	tiempo=0;
	    
	    scheduler.schedule(new Runnable() {public void run() { crearHorda.cancel(true); }
	    }, tiempo, TimeUnit.SECONDS);
	}
	
	public void ejecutarHordas() {

		scheduler.schedule(new Runnable() {public void run() { ejecutarHorda(hordas[0]); }
	    }, 5, TimeUnit.SECONDS);
		
		scheduler.schedule(new Runnable() {public void run() { 
			hordaActual=hordas[1];
			ejecutarHorda(hordas[1]);	 }
	    }, hordas[0].getCantEnemigos()*5+20, TimeUnit.SECONDS);	
		
		scheduler.schedule(new Runnable() {public void run() { 
			hordaActual=hordas[2];
			ejecutarHorda(hordas[2]); }
	    }, hordas[0].getCantEnemigos()*5+20+hordas[1].getCantEnemigos()*5+15, TimeUnit.SECONDS);
	
	}
	
	public void finalizarNivel() {
		//Si un enemigo llega a x entre 0 y 30 creo, se pierde el nivel
		scheduler.shutdown();
	}
	
	public boolean ultimaHorda() {
		return hordaActual==hordas[2];
	}
	
	public void shutdown() {
		scheduler.shutdown();
	}
	
}

