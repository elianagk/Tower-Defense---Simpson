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
	
	
	
	
	
	public void accionar() {
		miObjetoGrafico.accionar();
		super.mover(still_key);
	}

	
	
	@Override
	public void Aceptar(Visitor v) {
		v.visitar(this);
	}
	
	public boolean estaEnRango(GameObject g) {
		//System.out.println("torre: "+ this+ " Y " + this.getY());
		return (g.getX()==this.getX()+100 && g.getY()==this.getY())   ;
	}
	
	
	
}
