package GameObject.Personajes;

import java.awt.Point;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Disparos.DisparoLogicoEnemigo;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;

public abstract class Torre extends Personaje {
	protected int tiempo;

	public Torre(MapaLogico mapaLogico, GameObjectGrafico gog, int vida) {
		super(mapaLogico, gog, vida);		
		velocidad=0;		
		tiempo=15;
	}	
	
//	@Override
//	public void accionar() {
//		
//	}
	
	@Override
	public void Aceptar(Visitor v) {
		v.visitar(this);
	}
	
	@Override
	public boolean estaEnRango(GameObject g) {
		return (g.getX()>=getX() && g.getX()<=this.getX()+350 && g.getY()==this.getY());
	}
	
	@Override
	public boolean enContacto (Personaje e) {
		return (e.getX()>=getX() && e.getX()<=this.getX()+100 && e.getY()==this.getY());
	}
		
}
