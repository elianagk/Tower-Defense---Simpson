package Juego;


import java.util.ArrayList;
import GRAFICA.MapaGrafico;
import GameObject.GameObject;
import GameObject.Personajes.Enemigo;
import Jugador.Jugador;
import Mapa.MapaLogico;
import Nivel.Nivel;
import State.Comprando;
import State.Jugando;
import State.State;
import State.Vendiendo;
import Tienda.TiendaGrafica;



public class Juego {
	
	public Enemigo enemigos[];
	private int i;
	private Nivel niveles[];
	private Jugador jugador;
	private MapaGrafico mapaGrafico;
	private MapaLogico mapaLogico;
	private final int gravity_force = 5;
	private final int ground_position = 400;
	private State estado;
	private static State jugar;
	private static State comprar;
	private static State vender;
	private TiendaGrafica tienda;
	
	
	
	public Juego(MapaGrafico mapaGrafico, MapaLogico mapaLogico){
		niveles= new Nivel[2];
		this.mapaGrafico=mapaGrafico;
		this.mapaLogico= mapaLogico;
		niveles[0]= new Nivel(this, mapaLogico);
		niveles[1]= new Nivel(this, mapaLogico);
		jugar= new Jugando(this);
		comprar= new Comprando(this);
		vender= new Vendiendo(this);
		comenzarJuego();
	}
	
	private void comenzarJuego() {
		jugador= new Jugador();
		jugador.setMonedas(1500);
		tienda= new TiendaGrafica(mapaLogico.getTiendaLogica());
		tienda.actualizarPuntaje(jugador.getMonedas());
		comenzarNiveles();
	}
	
	public void mover(){
		ArrayList<GameObject> entidades = this.mapaLogico.getEntidades();
		ArrayList<GameObject> toCollide;
		for(GameObject e : entidades) {
			if (e.getEsValido()) {
				toCollide= this.mapaLogico.hayEnElRango(e);
			
				if(toCollide.size() == 0) {
					e.accionar();
				}else {
					for(GameObject toCollideElement: toCollide) {
						toCollideElement.Aceptar(e.getVisitor());		
					}
				}
			}
		}
	}
	
	
	public void comenzarNiveles() {
		niveles[0].ejecutarHordas();
		niveles[1].ejecutarHordas();
	}
	
	public MapaGrafico getMapaGrafico() {
		return mapaGrafico;
	}
	
	public MapaLogico getMapaL() {
		return mapaLogico;
	}
	
	public void setJugar() {
		estado=jugar;
		estado.actuar();
	}
	
	public void setComprar() {
		estado= comprar;
		estado.actuar();
	}
	
	public void setVender() {
		estado= vender;
		estado.actuar();
	}
	
	public Jugador getJugador() {
		return jugador;
	}
}
