package GameObject.Objetos;

import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Objeto;
import GameObjectGrafico.ObjetosGraficos.ObjetoPreciosoGrafico;
import Mapa.MapaLogico;

public class ObjetoPrecioso extends Objeto {
	protected int vida;
	
	public ObjetoPrecioso(MapaLogico mapaLogico) {
		super(mapaLogico, new ObjetoPreciosoGrafico());
	}
}
