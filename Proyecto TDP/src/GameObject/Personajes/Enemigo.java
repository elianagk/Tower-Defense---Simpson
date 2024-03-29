package GameObject.Personajes;

import java.awt.Point;
import java.util.Random;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.Magia;
import GameObject.Objetos.Magias.AumentoDeDa�o;
import GameObject.Objetos.Magias.Rejuvenecer;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;

public abstract  class Enemigo extends Personaje {
	
	protected int puntaje;
	protected int monedas;
	protected boolean atacando;
	protected int tiempo;
	
	
	public Enemigo(MapaLogico ml, GameObjectGrafico gog, int m, int vida) {
		super(ml, gog,vida);
		monedas= m;
		atacando=false;
		tiempo=15;
	}
	
	public void setAtacando(boolean a) {
		atacando=a;
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	public int getMonedas() {
		return monedas;
	}
	
	public void setMonedas(int monedas) {
		this.monedas = monedas;
	}
	
	@Override
	public void Aceptar(Visitor v) {
		v.visitar(this);
	}
	
	@Override
	public void accionar() {
		if (posicion.x<=0) 
			mapaLogico.gameOver();		
		else {
			estado.accionar();
		}
	}
	
	@Override
	public boolean estaEnRango(GameObject g) {		
		return (g.getX()>=this.getX()-100 && g.getX()<=getX() && g.getY()==this.getY()); 
	}
	

	public boolean enContacto(Personaje e) {						
		return estaEnRango(e);
	}
	
	@Override
	public boolean primerPersonajeMasCercano(Personaje e1, Personaje e2) {
		return e1.getX()>e2.getX();

	}
	
	@Override
	public void aplicarDa�o(int da�o) {		
		if (vida > da�o)
			vida -= da�o;
		else {
			vida = 0;
			esValido=false;
			actualizarPuntaje();	
			Random r= new Random();
			int n= r.nextInt()%4;
			if (n==0) {
				Magia m= powerup();
				m.setPosicion(new Point (this.getX(), this.getY()));							
				mapaLogico.getMapaGrafico().agregarEntidad(m);
				
				
			}
			monedas();			
			mapaLogico.entidadAEliminar(this);
		}
	}
	
	private Magia powerup() {
		
		
		Random r=new Random();
		int n= r.nextInt(2);
		Magia g=null;
		switch (n) {
		 case 0: g= new AumentoDeDa�o(mapaLogico);
         break;
         
         case 1: g= new Rejuvenecer(mapaLogico);
         break;
		}
		
		return g;
	}
	
	private void actualizarPuntaje() {
		mapaLogico.getJuego().getJugador().setPuntaje(mapaLogico.getJuego().getJugador().getPuntaje()+100);
		mapaLogico.getTiendaLogica().actualizarPuntaje();
	}
	
	private void monedas() {
		mapaLogico.getJuego().getJugador().setMonedas(mapaLogico.getJuego().getJugador().getMonedas()+monedas);
		mapaLogico.getTiendaLogica().actualizarPlata();
	}
	
}
