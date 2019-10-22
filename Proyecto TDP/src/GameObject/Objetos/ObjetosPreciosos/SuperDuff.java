package GameObject.Objetos.ObjetosPreciosos;

import GameObject.Personaje;
import GameObject.Objetos.ObjetoPrecioso;
import GameObjectGrafico.ObjetosGraficos.ObjetosPreciososGraficos.SuperDuffGrafico;
import Mapa.MapaLogico;

public class SuperDuff extends ObjetoPrecioso {

	public SuperDuff(MapaLogico mapaLogico) {
		super(mapaLogico, new SuperDuffGrafico(), 200);	//3�vida
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accionar(Personaje c) {
		// TODO Auto-generated method stub
		
	}
}
