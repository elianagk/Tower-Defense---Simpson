package Mapa;


import GameObject.*;
import Juego.Juego;
import java.util.ArrayList;
import Tienda.TiendaLogica;
import java.awt.Point;
import GRAFICA.MapaGrafico;

public class MapaLogico  {
	private ArrayList<GameObject> entidades, entidadesAAgregar, entidadesAEliminar, clonada;
	private MapaGrafico mapaGrafico;
	private int width, height;
	private TiendaLogica tiendaLogica;
	private Juego juego;
	private GameObject proxMagia;
	


	public MapaLogico (int width, int height, MapaGrafico mapa) {
		entidades= new ArrayList<GameObject> ();
		entidadesAAgregar= new ArrayList<GameObject> ();
		entidadesAEliminar= new ArrayList<GameObject> ();
		this.width=width;
		this.height=height;
		tiendaLogica=null;
		mapaGrafico=mapa;
		
		
		
	}
	
	
	
	public void setTiendaLogica(TiendaLogica tiendaLogica) {
		this.tiendaLogica=tiendaLogica;
	}
	
	public void setMapaGrafico(MapaGrafico m) {
		mapaGrafico= m;
	}
	
	public MapaGrafico getMapaGrafico() {
		return mapaGrafico;
	}
	public ArrayList<GameObject> hayEnElRango(GameObject g) {
		ArrayList<GameObject> toReturn = new ArrayList<GameObject>();
		
		for (GameObject e: entidades) {
			if (e.estaEnRango(g)) {
				toReturn.add(e);				
			}
			
		}
		return toReturn;	
		
	}
	
	public ArrayList<GameObject> getEntidades() {
		actualizarListaDeEntidades();
		entidades= clonada;
		return entidades;
	}
	
	
	
	public void entidadAEliminar(GameObject o) {
		entidadesAEliminar.add(o);
	}
	
	/**
	 * remueve una entidad o del la lista de personajes y del mapa grafico
	 * @param o entidad a remover
	 */
	public void removerEntidad(GameObject o, ArrayList<GameObject> lista) {
		lista.remove(o);
		mapaGrafico.removerEntidad(o);
	}
	
	public void entidadAAgregar(GameObject o, int x, int y) {
		Point p = new Point (x, y);
		o.setPosicion(p);
		entidadesAAgregar.add(o);
	}
	
	public void agregarEntidad(GameObject o, ArrayList<GameObject> lista) {
		
			lista.add(o);
			mapaGrafico.agregarEntidad(o);
			
		}
	
	
	public  void actualizarListaDeEntidades() {
		clonada= (ArrayList<GameObject>) entidades.clone();
		for (GameObject objEliminar : entidadesAEliminar) {
			removerEntidad(objEliminar, clonada);
		}
		
		for (GameObject objAgregar : entidadesAAgregar) {
			agregarEntidad(objAgregar, clonada);
		}
		
		
		entidadesAEliminar.clear();
		entidadesAAgregar.clear();
		
		
	}
	
	public void setJuego(Juego j) {
		juego=j;
	}
	
	//Sirve para matar a apu desde un boton
	public Juego getJuego() {
		return juego;
	}
	
	
	
	public TiendaLogica getTiendaLogica() {
		return tiendaLogica;
	}
	
	public void gameOver() {
		entidadesAEliminar=(ArrayList<GameObject>) entidades.clone();
		entidadesAAgregar.clear();
		actualizarListaDeEntidades();
		mapaGrafico.gameOver();
		
	}
	
	public void victory() {
		entidadesAEliminar=(ArrayList<GameObject>) entidades.clone();
		entidadesAAgregar.clear();
		actualizarListaDeEntidades();
		mapaGrafico.victory();
	}
	
	public void proximaMagia(GameObject m) {
		proxMagia=m;
		
	}
	
	public GameObject getProximaMagia() {
		return proxMagia;
	}
	
	
	
}

