package Nivel;

import Hordas.Horda;
import Juego.Juego;
import Mapa.MapaLogico;

public class Nivel {
	private Horda horda;
	private Juego juego;
	private MapaLogico mapaLogico;
	
	
	public void ejecutarHorda() {
		horda= new Horda(this, null, 1);
		horda
	}
	
	public void ejecutarHordas() {
		ejecutarHorda();
	}
	
	public void finalizarNivel() {
		
	}
	
}
