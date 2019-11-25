package GameObjectGrafico.ObjetosGraficos.ObjetosConVida;

import GameObject.Objeto;
import GameObjectGrafico.GameObjectGrafico;
import GameObjectGrafico.ObjetoGrafico;
import GameObjectGrafico.ObjetosGraficos.ObjetoPreciosoGrafico;
import Mapa.MapaLogico;

public class SuperDuffGrafico extends ObjetoPreciosoGrafico{

	public SuperDuffGrafico(MapaLogico ml) {
		super("duff.png", ml);	
		this.setSize(100, 100);
		
	}

}
