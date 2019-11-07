package GameObject.Personajes;

import java.awt.Point;
import java.util.Random;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.Magia;
import GameObject.Objetos.Magias.AumentoDeDaño;
import GameObject.Objetos.Magias.Rejuvenecer;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;

public abstract  class Enemigo extends Personaje {
	
	protected int puntaje;
	protected int monedas;
	private int contador;
	private int tiempo;
	
	
	public Enemigo(MapaLogico ml, GameObjectGrafico gog) {
		super(ml, gog);
		tiempo=3;
		contador=0;
		alcance=50;
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
			if (accionar)
				miObjetoGrafico.accionar();			
		}
		if (accionar)
			super.mover(backward_key);
	}
	
	public boolean estaEnRango(GameObject g) {
		
		return (g.getX()>=this.getX()-100 && g.getX()<=getX() && g.getY()==this.getY()); 
	}
	
	
	@Override
	public void aplicarDaño(int daño) {
		if (vida > daño)
			vida -= daño;
		else {
			vida = 0;
			esValido=false;
			mapaLogico.getJuego().getJugador().setPuntaje(mapaLogico.getJuego().getJugador().getPuntaje()+100);
			mapaLogico.entidadAEliminar(this);
			contador++;
			if (contador==tiempo) {
				Magia m= new Rejuvenecer(mapaLogico);
				mapaLogico.entidadAAgregar(m, this.getX(), this.getY());
				mapaLogico.proximaMagia(m);	
			}
			
		}
	}
	
	private Magia powerup() {
		
		
		Random r=new Random();
		int n= r.nextInt(2);
		Magia g=null;
		switch (n) {
		 case 1: g= new AumentoDeDaño(mapaLogico);
         break;
         
         case 2: g= new Rejuvenecer(mapaLogico);
		}
		
		return g;
	}
	

}
