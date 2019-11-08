package GameObjectGrafico.ObjetosGraficos.ObjetosConVida;

import GameObject.Objeto;
import GameObjectGrafico.GameObjectGrafico;
import GameObjectGrafico.ObjetoGrafico;
import GameObjectGrafico.ObjetosGraficos.ObjetoPreciosoGrafico;
import Mapa.MapaLogico;

public class SuperDuffGrafico extends ObjetoPreciosoGrafico{

	public SuperDuffGrafico(MapaLogico ml) {
		super("duff.png", ml);	
		this.setSize(500, 450);
		
	}
	
	public boolean dentroHitbox(int x, int y, GameObjectGrafico gog) {
		boolean dentro= false;
		if(gog.getBounds().intersects(x, y, 100, 100)) {
			dentro= true;
		}
		return dentro;
	}

}
