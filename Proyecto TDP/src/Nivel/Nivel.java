package Nivel;

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
	}
	
	public void ejecutarHorda() {
		horda= new Horda(this, mapaLogico, 2);
		juego.addEnemigo(horda.crearEnemigo());
//		juego.addEnemigo(horda.crearEnemigo());
//		juego.addEnemigo(horda.crearEnemigo());
		mapaLogico.entidadAAgregar(juego.enemigos[0], juego.enemigos[0].getX(),juego.enemigos[0].getY());
//		mapaLogico.agregarEntidad(juego.enemigos[1], juego.enemigos[1].getX(),juego.enemigos[1].getY());
//		mapaLogico.agregarEntidad(juego.enemigos[2], juego.enemigos[2].getX(),juego.enemigos[2].getY());
	}
	
	public void ejecutarHordas() {
		ejecutarHorda();
	}
	
	public void finalizarNivel() {
		
	}
}
