package GameObject;

import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public abstract class Objeto extends GameObject {

	
	public Objeto(MapaLogico ml, GameObjectGrafico gog) {
		super(ml, gog);
		
	}

	
	public abstract void accionar(Personaje e);
	
	
	public boolean estaEnRango(GameObject g) {
		return (g.getX()>=getX() && g.getX()<=this.getX()+100 && g.getY()==this.getY())   ;
	}
	
	
	
	

}
