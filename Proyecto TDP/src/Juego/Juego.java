package Juego;


import java.util.ArrayList;
import GRAFICA.MapaGrafico;
import GameObject.GameObject;
import Jugador.Jugador;
import Mapa.MapaLogico;
import Nivel.Nivel;
import State.Jugando;
import State.State;
import Tienda.TiendaGrafica;
import VISITOR.Visitor;
import VISITOR.VisitorVictory;



public class Juego {
	
//	public Enemigo enemigos[];
	private int nivelActual;
	private Nivel niveles[];	
	private Jugador jugador;
	private MapaGrafico mapaGrafico;
	private MapaLogico mapaLogico;
	private boolean hayEnemigos;
	private State estado;
	private TiendaGrafica tienda;
	private Visitor visitorVictoria;
	
	
	public Juego(MapaGrafico mapaGrafico, MapaLogico mapaLogico){
		visitorVictoria=new VisitorVictory(this);
		nivelActual=0;
		niveles= new Nivel[1];
		niveles[0]= new Nivel(this, mapaLogico);
		jugador=new Jugador();
		this.mapaGrafico=mapaGrafico;
		this.mapaLogico= mapaLogico;
		estado= new Jugando(this);
		comenzarNiveles();
	}
	
	
	
	public void mover(){
		ArrayList<GameObject> entidades = this.mapaLogico.getEntidades();
		ArrayList<GameObject> toCollide;
		hayEnemigos=false;
		for(GameObject e : entidades) {
	
			if (e.getEsValido()) {
				toCollide= this.mapaLogico.hayEnElRango(e);
				if (nivelActual==0 && niveles[nivelActual].ultimaHorda()) {
					e.Aceptar(visitorVictoria);
				}
					
					
					
				if(toCollide.size() == 0) {
					e.accionar();
				}else {
					for(GameObject toCollideElement: toCollide) {
						toCollideElement.Aceptar(e.getVisitor());		
					}
				}
			}
		}
		if (!hayEnemigos && nivelActual==0 && niveles[nivelActual].ultimaHorda())
			victory();
	}
	
	
	public void comenzarNiveles() {
		niveles[0].ejecutarHordas();
	}
	
	public void hayEnemigos(boolean e) {
		hayEnemigos=e;
	}
	
	public MapaGrafico getMapaGrafico() {
		return mapaGrafico;
	}
	
	public MapaLogico getMapaL() {
		return mapaLogico;
	}
	
	public void cambiarEstado(State s) {
		estado=s;
		estado.actuar();
	}
	
	public Jugador getJugador() {
		return jugador;
	}
	
	public void gameOver() {
		niveles[nivelActual].shutdown();
	}
	
	public void victory() {
		mapaLogico.victory();
	}
	
}
