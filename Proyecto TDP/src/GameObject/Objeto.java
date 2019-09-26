package GameObject;

import GameObjectGrafico.GameObjectGrafico;
import GameObjectGrafico.ObjetoGrafico;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.BartGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public class Objeto extends GameObject {

	
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
}
