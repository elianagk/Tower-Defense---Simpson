package GameObject.Personajes;

import java.awt.Point;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;

public abstract class Torre extends Personaje {
	
	
//	protected VisitorAliado visitor;

	public Torre(int precio, int vida, int daño, int alcance, MapaLogico mapaLogico, GameObjectGrafico gog) {
		super(mapaLogico, gog);
		costo= precio;
		this.vida= vida;
		this.daño= daño;
		this.alcance=alcance;
		
	}
	
	
	
	@Override
	public abstract void atacar(Personaje e);

	
	
	@Override
	public void Aceptar(Visitor v) {
		v.visitar(this);
		
	}
	//mirar el alto , linea
	public boolean estaEnRango(GameObject g) {
		
		return (g.getX()==this.getX()+100 && (g.getY()>=this.getY() || g.getY()-20<=this.getY()))   ;
	}
	
	private boolean lineas(int y, int yy) {
		Point[] p= mapaLogico.getMapaGrafico().getLineas();
		boolean toReturn =false;
		for (int i=0; i<p.length; i++) {
			if (y>p[i].getX() && y<p[i].getY()) {
				if (yy>p[i].getX() && yy<p[i].getY()) {
					System.out.println("Torre : Y : "+ y + " YY: " + yy);
					toReturn =true;
				}
				
			}
		}
			
			
		return toReturn;
	}
	
}
