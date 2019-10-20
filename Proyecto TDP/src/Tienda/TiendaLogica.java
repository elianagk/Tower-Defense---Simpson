package Tienda;


import GameObject.GameObject;
import GameObject.Objeto;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;
import Juego.Juego;
import Jugador.Jugador;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorVender;



public class TiendaLogica {
	
	
	private MapaLogico mapaLogico;
	private GameObject g;
	private Visitor visitor;
	private Jugador jugador;
	
	
	
	
	
	public TiendaLogica(MapaLogico mapa) {
		g= null;
		mapaLogico= mapa;
		visitor= new VisitorVender(this);
		jugador= mapa.getJugador();
	}
	
	public void revisarTienda(int x, int y) {
		if (ProximaEntidad()) {
			mapaLogico.entidadAAgregar(g, x, y);
			jugador.setPuntaje(jugador.getPuntaje()-g.getCosto());
			
			g= null;
			
		}
	}
	
	public void vender(Torre torre) {
		int retornoDinero=0;
		if (torre.getVida()>=torre.getVidaTotal()/2)
			retornoDinero=torre.getCosto();
		else
			retornoDinero=torre.getCosto()/2;
		
		mapaLogico.entidadAEliminar(torre);
		jugador.setPuntaje(jugador.getPuntaje()+retornoDinero);
		
	}
	
	public void vender(Enemigo e) {		// por si se selecciona a un enemigo, retorna -1 para mostrar que no es valido y siga esperando que se venda una torre
		jugador.setPuntaje(jugador.getPuntaje());
	}
	
	public void vender(Objeto e) {
		jugador.setPuntaje(jugador.getPuntaje());
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
	
	public Visitor getVisitor() {
		return visitor;
	}
	
	public int monedas() {
		return jugador.getPuntaje();
	}
	
	
}
