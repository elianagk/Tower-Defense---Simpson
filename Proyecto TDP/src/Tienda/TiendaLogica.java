package Tienda;


import GameObject.GameObject;
import GameObject.Objeto;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;
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
	
	public int vender(Torre torre) {
		int retornoDinero=0;
		if (torre.getVida()>=torre.getVidaTotal()/2)
			retornoDinero=torre.getCosto();
		else
			retornoDinero=torre.getCosto()/2;
		
		mapaLogico.entidadAEliminar(torre);
		
		return retornoDinero;
	}
	
	public int vender(Enemigo e) {		// por si se selecciona a un enemigo, retorna -1 para mostrar que no es valido y siga esperando que se venda una torre
		return -1;
	}
	
	public int vender(Objeto e) {
		return -1;
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
