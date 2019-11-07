package GameObjectGrafico.ObjetosGraficos.ObjetosPreciososGraficos;

import GameObject.Objeto;
import GameObjectGrafico.ObjetoGrafico;
import GameObjectGrafico.ObjetosGraficos.ObjetoPreciosoGrafico;
import Mapa.MapaLogico;

public class SuperDuffGrafico extends ObjetoPreciosoGrafico{

	public SuperDuffGrafico(MapaLogico ml) {
		super("duff.png", ml);	
		this.setSize(200, 100);
		
	}
	
}
