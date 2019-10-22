package Nivel;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;
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
	private ArrayList<ArrayList<GameObject>> listaentidades;
	private int cantHordas;
	


	
	public Nivel(Juego juego, MapaLogico mapaLogico) {
		this.juego= juego;
		this.mapaLogico= mapaLogico;
		cantHordas=3;
		
		this.ejecutarHordas();
		
		
		
		
	}
	
	public void crearEnemigo() {
		GameObject g= horda.crearEnemigo();
		mapaLogico.entidadAAgregar(g, g.getX(), g.getY());
	}
	
	public void ejecutarHorda() {
		
		
	
		horda= new Horda(this, mapaLogico, 20);
		
		final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
//		final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
		
		final ScheduledFuture<?> crearHorda = 
	    scheduler.scheduleAtFixedRate(new Runnable() {
	    	 @Override
	    	 public void run() { crearEnemigo(); }
	     }, 0, 5, TimeUnit.SECONDS);
		
	     
	    scheduler.schedule(new Runnable() {public void run() { crearHorda.cancel(true); }
	    }, horda.getCantEnemigos()*5-5, TimeUnit.SECONDS);
	    
	  
	    
	
	    
		}
//
//	    	     final Runnable beeper = new Runnable() {
//	    	       public void run() { System.out.println("beep"); }
//	    	     };
//	    	     final ScheduledFuture<?> beeperHandle =
//	    	       scheduler.scheduleAtFixedRate(beeper, 10, 10, SECONDS);
//	    	     scheduler.schedule(new Runnable() {
//	    	       public void run() { horda.finalizarHorda(); }
//	    	     }, horda.getCantEnemigos()*5, SECONDS);
		
//		int i=0;
//		while(i!=3) {
//	
//			int tiempo=100;
//			int cont=0;
//			int tiempo2=10;
//			int cont2=0;
//			Random r= new Random();
//			int n= r.nextInt(4);
//			horda= new Horda(this, mapaLogico, n);
//			
//				while(!horda.finalizarHorda()) {
//					int m= r.nextInt(10000);
//					if ((m>150) && (m<175))
//						this.crearEnemigo();
//					
//							
//				}	
//				
//				this.esperar();
//				i++;
//		}

	


	
//	private void horda(int cantEnemigos) {
//		
//		horda= new Horda(this, mapaLogico, cantEnemigos);
//		
//	}
	
	
	private void llenarLista() {
		ArrayList<GameObject> enemigo= new ArrayList<GameObject>();
		Random r= new Random();
		int n= r.nextInt(30);
		int i=0;
		while (i<n) {
			
			enemigo.add(horda.crearEnemigo());
			i++;
		}
		
		listaentidades.add(enemigo);
	}
	
	public void ejecutarHordas() {
		ejecutarHorda();
	}
	
	public void finalizarNivel() {
		//Si un enemigo llega a x entre 0 y 30 creo, se pierde el nivel
	}
}
