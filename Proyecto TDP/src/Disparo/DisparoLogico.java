package Disparo;

import GameObject.GameObject;
import GameObject.Objeto;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public class DisparoLogico extends Objeto {

	public DisparoLogico(MapaLogico ml, GameObjectGrafico gog) {
		super(ml, gog);
	
	}

	@Override
	public GameObject clone() {
		
		return null;
	}

	@Override
	public void Aceptar(Visitor visitor) {
		visitor.visitar(this);
		
	}

}
