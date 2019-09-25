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
		horda= new Horda(this, mapaLogico, 1);
		juego.addEnemigo(horda.crearEnemigo());
	}
	
	public void ejecutarHordas() {
		ejecutarHorda();
	}
	
	public void finalizarNivel() {
		
	}
	
}
