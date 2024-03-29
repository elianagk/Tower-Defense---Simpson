package Nivel;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import GameObject.GameObject;
import GameObject.Objetos.ObjetosConVida.Maggie;
import GameObject.Objetos.ObjetosConVida.SuperDuff;
import Hordas.Horda;
import Juego.Juego;
import Mapa.MapaLogico;

public class Nivel {
	private Horda [] hordas;
	private Horda hordaActual;
	private Juego juego;
	private MapaLogico mapaLogico;
	private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
	
	public Nivel(Juego juego, MapaLogico mapaLogico, int enemigosAņadidos) {
		this.juego= juego;
		this.mapaLogico= mapaLogico;
		hordas= new Horda[3];
		hordas[0]= new Horda(this, mapaLogico, 8+enemigosAņadidos);
		hordaActual= hordas[0];
		hordas[1]= new Horda(this, mapaLogico, 12+enemigosAņadidos);
		hordas[2]= new Horda(this, mapaLogico, 16+enemigosAņadidos);
	}
	
	public void crearEnemigo(Horda horda) {
		GameObject g= horda.crearEnemigo();
		mapaLogico.entidadAAgregar(g, g.getX(), g.getY());
	}
	
	public void crearEventoAleatorio() {
		GameObject g;
		Random r = new Random();
		int x;
		int y;
		int opcion;
		int eventoAleatorio= r.nextInt(7)+1;
		if(eventoAleatorio==1) {
			opcion= r.nextInt(2)+1;
			if(opcion==1) {
				g= new SuperDuff(mapaLogico);
				y= (r.nextInt(6)+2)*100;
				x= (r.nextInt(9)+1)*100;
				mapaLogico.entidadAAgregar(g, x, y);
			}else {
				g= new Maggie(mapaLogico);
				y= (r.nextInt(6)+2)*100;
				x= (r.nextInt(9)+1)*100;
				mapaLogico.entidadAAgregar(g, x, y);
			}
		}	
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
	    	 public void run() {
	    		 crearEnemigo(horda); 
	    		 crearEventoAleatorio();
	    	 }
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
	
	public boolean finNivel() {
		return hordaActual==hordas[2] && hordaActual.finalizarHorda();
	}
	
	public void shutdown() {
		scheduler.shutdown();
	}
	
}

