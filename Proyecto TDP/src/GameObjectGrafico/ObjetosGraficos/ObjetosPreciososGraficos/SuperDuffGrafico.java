package GameObjectGrafico.ObjetosGraficos.ObjetosPreciososGraficos;

import GameObject.Objeto;
import GameObjectGrafico.GameObjectGrafico;
import GameObjectGrafico.ObjetoGrafico;
import GameObjectGrafico.ObjetosGraficos.ObjetoPreciosoGrafico;
import Mapa.MapaLogico;

public class SuperDuffGrafico extends ObjetoPreciosoGrafico{

	public SuperDuffGrafico(MapaLogico ml) {
		super("duff.png", ml);	
		this.setSize(200, 100);
		
	}
	
	public boolean dentroHitbox(int x, int y, GameObjectGrafico gog) {
		boolean dentro= false;
		if(gog.getBounds().intersects(x, y, 100, 100)) {
			dentro= true;
		}
		return dentro;
	}

}
