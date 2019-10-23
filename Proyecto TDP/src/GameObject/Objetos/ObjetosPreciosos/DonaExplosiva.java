package GameObject.Objetos.ObjetosPreciosos;

import GameObject.Personaje;
import GameObject.Objetos.ObjetoPrecioso;
import GameObjectGrafico.ObjetosGraficos.ObjetosPreciososGraficos.DonaExplosivaGrafica;
import Mapa.MapaLogico;

public class DonaExplosiva extends ObjetoPrecioso {

	public DonaExplosiva(MapaLogico mapaLogico) {
		super(mapaLogico, new DonaExplosivaGrafica(), 100);	//3°vida
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
