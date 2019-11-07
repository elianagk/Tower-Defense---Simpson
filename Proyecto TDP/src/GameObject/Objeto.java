package GameObject;

import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public abstract class Objeto extends GameObject {

	
	public Objeto(MapaLogico ml, GameObjectGrafico gog) {
		super(ml, gog);
		costo=0;
	}

	
	public abstract void Aceptar(Visitor visitante) ;

	
	
	public abstract GameObject clone() ;

	@Override
	public abstract void accionar() ;
	
	public abstract void accionar(GameObject o);
	
	public boolean estaEnRango(GameObject g) {
		return (g.getX()>=getX() && g.getX()<=this.getX()+100 && g.getY()==this.getY())   ;
	}
	
	public abstract void activar();
	
	

}
