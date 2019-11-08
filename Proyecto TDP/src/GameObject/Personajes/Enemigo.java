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
	
	
	
	public Enemigo(MapaLogico ml, GameObjectGrafico gog) {
		super(ml, gog);
	
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
	public void atacar(Personaje e) {
		accionar=false;	
		if (e.getX()>=this.getX()-100 && e.getX()<=getX() && e.getY()==this.getY()) {				
			super.mover(still_key);
			miObjetoGrafico.atacar();		
			e.aplicarDa�o(da�o);
		}
		else
			super.mover(backward_key);		
		
		if (!e.getEsValido())
			accionar=true;
	}
	
	@Override
	public void accionar() {		
		if (posicion.x<=0)
			mapaLogico.gameOver();
		else {							
			if (accionar)
				super.mover(backward_key);
		}
	}
	
	public boolean estaEnRango(GameObject g) {		
		return (g.getX()>=this.getX()-100 && g.getX()<=getX() && g.getY()==this.getY()); 
	}
	
	
	@Override
	public void aplicarDa�o(int da�o) {
		if (vida > da�o)
			vida -= da�o;
		else {
			vida = 0;
			esValido=false;
			int x= this.getX();
			int y= this.getY();
			actualizarP();
			
			mapaLogico.entidadAEliminar(this);
			Random r= new Random();
			int n= r.nextInt(10);
			if (n>5) {
				Magia m= powerup();
				mapaLogico.entidadAAgregar(m,x-5, y);
				m.activar();
				
				
			}
			
			int m= r.nextInt(50);
			if (m>25) {
				monedas();
			}
			
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
	
	private void actualizarP() {
		mapaLogico.getJuego().getJugador().setPuntaje(mapaLogico.getJuego().getJugador().getPuntaje()+100);
		mapaLogico.getTiendaLogica().actualizarPuntaje();
	}
	
	private void monedas() {
		Random r= new Random();
		int n= r.nextInt(20);
		if (n==18) {
			mapaLogico.getJuego().getJugador().setMonedas(mapaLogico.getJuego().getJugador().getMonedas()+500);
			mapaLogico.getTiendaLogica().actualizarPlata();
		}
	}
	
	
}
