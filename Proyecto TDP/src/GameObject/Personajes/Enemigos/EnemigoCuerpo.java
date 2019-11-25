package GameObject.Personajes.Enemigos;

import GameObject.GameObject;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;

public class EnemigoCuerpo extends Enemigo{
	
	public EnemigoCuerpo(MapaLogico ml, GameObjectGrafico gog, int m, int vida) {
		super(ml, gog, m, vida);
	}

	@Override
	public GameObject clone() {
		// TODO Auto-generated method stub
		return null;
	}

}
