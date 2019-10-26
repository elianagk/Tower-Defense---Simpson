package GameObject;

import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public abstract class Objeto extends GameObject {

	
	public Objeto(MapaLogico ml, GameObjectGrafico gog) {
		super(ml, gog);
	}

	
	public abstract void Aceptar(Visitor visitante) ;

	
	
	public abstract GameObject clone() ;

	@Override
	public abstract void accionar() ;
	
	public abstract void accionar(Personaje c);
	
	public boolean estaEnRango(GameObject g) {
		
			return (g.getX()==posicion.x && g.getY()==this.posicion.y); 
		
	}
	
	public abstract void activar();
	
	

}
