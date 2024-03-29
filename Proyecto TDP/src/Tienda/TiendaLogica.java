package Tienda;


import GameObject.GameObject;
import GameObject.Objeto;
import GameObject.Objetos.ObjetoConVida;
import GameObject.Objetos.ObjetoPrecioso;
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
	private Juego juego;
	private Jugador jugador;
	private TiendaGrafica tienda;
	
		
	public TiendaLogica(MapaLogico mapa) {
		g= null;
		mapaLogico= mapa;
		visitor= new VisitorVender(this);
	}
	
	public void setTiendaGrafica(TiendaGrafica g) {
		tienda= g;
	}
	
	public void setJugador() {
		juego= mapaLogico.getJuego();
		jugador= juego.getJugador();
		tienda.actualizarPlata(jugador.getMonedas());
		tienda.actualizarPuntaje(jugador.getPuntaje());
	}
	
	public void actualizarPlata() {
		tienda.actualizarPlata(jugador.getMonedas());
	}
	
	public void actualizarPuntaje() {
		tienda.actualizarPuntaje(jugador.getPuntaje());
	}
	
	public Jugador getJugador() {
		return jugador;
	}
	
	public boolean sePuedeComprar( int x) {
		boolean sepuede=true;
		if (jugador.getMonedas()==0 || jugador.getMonedas()<x) {
			sepuede=false;
		}
		
		return sepuede;
	}
	
	public void revisarTienda(int x, int y) {
		boolean ocupado;
		if (ProximaEntidad() && sePuedeComprar(g.getCosto())) {			
			ocupado= mapaLogico.entidadAAgregar(g, x, y);
			if (!ocupado) {
				jugador.setMonedas(jugador.getMonedas()-g.getCosto());
				tienda.actualizarPlata(jugador.getMonedas());
			}
			g= null;
		}
	}
	
	public void vender(Torre torre) {
		int retornoDinero=0;
		if (torre.getVida()>=torre.getVidaTotal()/2)
			retornoDinero=torre.getCosto();
		else
			retornoDinero=torre.getCosto()/2;
		
		torre.setEsValido(false);
		mapaLogico.entidadAEliminar(torre);
		jugador.setMonedas(jugador.getMonedas()+retornoDinero);
		tienda.actualizarPlata(jugador.getMonedas());
		
	}
	
	public void vender(ObjetoConVida o) {
		
	}
	
	public void vender(Enemigo e) {		

	}
	
	public void vender(Objeto e) {
	
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
