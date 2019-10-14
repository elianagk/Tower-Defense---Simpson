package Tienda;


import GameObject.GameObject;
import Juego.Juego;
import Mapa.MapaLogico;


public class TiendaLogica {
	
	
	private MapaLogico mapaLogico;
	private GameObject g;
	
	
	
	public TiendaLogica(MapaLogico mapa) {
		g= null;
		mapaLogico= mapa;
	}
	
	public void revisarTienda(int x, int y) {
		if (ProximaEntidad()) {
			mapaLogico.entidadAAgregar(g, x, y);
			g= null;
		}
	}
	
	
	
	public void setEntidad(GameObject o) {
		g= o;
	}
	
	public GameObject getEntidad() {
		return g;
	}
	
	public boolean ProximaEntidad() {
		return g!=null;
	}
	
	//Sirve para matar a apu desde un boton
	public MapaLogico getMapaLogico() {
		return mapaLogico;
	}
	
	public Juego getJuego() {
		return mapaLogico.getJuego();
	}
}
