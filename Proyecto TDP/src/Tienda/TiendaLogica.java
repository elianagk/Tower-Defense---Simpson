package Tienda;

import GRAFICA.MapaGrafico;
import GameObject.GameObject;
import Mapa.Mapa;
import Tienda.Botones.*;

public class TiendaLogica {
	
	private MapaGrafico mapag;
	private Mapa mapal;
	private GameObject g;
	
	
	
	public TiendaLogica() {
		g=null;
		
	}
	
	public void revisarTienda(int x, int y) {
		if (ProximaEntidad()) {
			mapal.agregarEntidad(g, x, y);
			g=null;
		}
	}
	
	
	
	public void setEntidad(GameObject o) {
		g=o;
	}
	
	public GameObject getEntidad() {
		return g;
	}
	
	public boolean ProximaEntidad() {
		return g!=null;
	}
	

}
