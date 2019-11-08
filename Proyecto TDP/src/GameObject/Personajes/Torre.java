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
	}	
	
	public void accionar() {
		if (accionar) {
			miObjetoGrafico.accionar();
			super.mover(still_key);
		}
	}

	@Override
	public void atacar(Personaje e) {
		accionar=false;
		miObjetoGrafico.atacar();				
		e.aplicarDaño(daño);	
		if (!e.getEsValido()) { 
			accionar=true;		
			mover(still_key);
		}
	}
	
	@Override
	public void Aceptar(Visitor v) {
		v.visitar(this);
	}
	
	public boolean estaEnRango(GameObject g) {
		return (g.getX()>=getX() && g.getX()<=this.getX()+350 && g.getY()==this.getY())   ;
	}
	
	
	
}
