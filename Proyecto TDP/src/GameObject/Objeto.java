package GameObject;

import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public abstract class Objeto extends GameObject {

	public Objeto(MapaLogico ml, GameObjectGrafico gog) {
		super(ml, gog);
	}

	@Override
	public void Aceptar(Visitor visitante) {
		// TODO Auto-generated method stub

	}

	@Override
	public GameObject clone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public abstract void accionar() ;

	@Override
	public Visitor getVisitor() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
