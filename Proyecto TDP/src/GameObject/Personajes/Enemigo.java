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
	
//	protected VisitorEnemigo visitor;
	
	
	public Enemigo(MapaLogico ml, GameObjectGrafico gog) {
		super(ml, gog);
		tiempo=3;
		contador=0;
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

//		if (posicion.x<=0)
//			mapaLogico.gameOver();
//		else
			super.mover(backward_key);

	}
	
	public boolean estaEnRango(GameObject g) {
		//System.out.println(this+" - "+g+" - Collide: "+(this.getY() <= g.getY() && (this.getY()+this.height) >= g.getY()));
		return (g.getX()+100==this.getX() && g.getY()<=this.getY()); 
	}
	
	private boolean lineas(int y, int yy) {
		Point[] p= mapaLogico.getMapaGrafico().getLineas();
		boolean toReturn =false;
		for (int i=0; i<p.length; i++) {
			if (y>p[i].getX() && y<p[i].getY()) {
				if (yy>p[i].getX() && yy<p[i].getY()) {
					toReturn =true;
				}
				
			}
		}
			
			
		return toReturn;
	}
	
	@Override
	public void aplicarDaño(int daño) {
		if (vida > daño)
			vida -= daño;
		else {
			vida = 0;
			esValido=false;
			mapaLogico.entidadAEliminar(this);
//			contador++;
//			if (contador==tiempo) {
				Magia m= new Rejuvenecer(mapaLogico);
				mapaLogico.entidadAAgregar(m, this.getX(), this.getY());
				//mapaLogico.proximaMagia(m);
				mapaLogico.getJuego().setMagias();
				
//			}
			
		}
	}
	
	private Magia powerup() {
		
		
		Random r=new Random();
		int n= r.nextInt(10);
		Magia g=null;
		switch (n) {
		 case 1:
         case 3:
         case 5:
         case 7:
         case 8: g= new AumentoDeDaño(mapaLogico);
         break;
         
         case 2:
         case 4:
         case 6:
         case 9:
         case 10: g= new Rejuvenecer(mapaLogico);
		}
		
		return g;
	}
	

}
