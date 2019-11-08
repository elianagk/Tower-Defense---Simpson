package GameObject.Objetos;

import GameObject.GameObject;
import GameObject.Objeto;
import GameObject.Personaje;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public abstract class ObjetosSinMagia extends Objeto{

	public ObjetosSinMagia(MapaLogico ml, GameObjectGrafico gog) {
		super(ml, gog);
		this.costo=500;
	}

	
	public abstract void Aceptar(Visitor visitante) ;

	
	public abstract GameObject clone();
	
	
	
	
	

	

}
