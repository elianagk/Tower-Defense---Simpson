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
import State.Magias;
import State.State;
import State.Vendiendo;
import Tienda.TiendaGrafica;



public class Juego {
	
	public Enemigo enemigos[];
	private int nivelActual;
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
	private static State magia;
	
	
	
	public Juego(MapaGrafico mapaGrafico, MapaLogico mapaLogico){

		nivelActual=0;
		niveles= new Nivel[1];
		niveles[0]= new Nivel(this, mapaLogico);
		jugador=new Jugador();
		this.mapaGrafico=mapaGrafico;
		this.mapaLogico= mapaLogico;
		comenzarNiveles();
		jugar= new Jugando(this);
		comprar= new Comprando(this);
		vender= new Vendiendo(this);
		magia= new Magias(this);
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
	
	public void setMagias() {
		estado=magia;
		estado.actuar();
	}
	
	public Jugador getJugador() {
		return jugador;
	}
	
	public void gameOver() {
		niveles[nivelActual].shutdown();
	}
	
	public void victory() {
		
	}
	
}
