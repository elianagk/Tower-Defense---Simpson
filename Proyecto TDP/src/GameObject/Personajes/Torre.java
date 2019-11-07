package GameObject.Personajes;

import java.awt.Point;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;

public abstract class Torre extends Personaje {
	

	public Torre(MapaLogico mapaLogico, GameObjectGrafico gog) {
		super(mapaLogico, gog);
		velocidad=0;
		alcance=50;
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
		return (g.getX()==this.getX()+100 && g.getY()==this.getY())   ;
	}
	
	
	
}
