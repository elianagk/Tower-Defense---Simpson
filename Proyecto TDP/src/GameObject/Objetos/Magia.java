package GameObject.Objetos;

import GameObject.Objeto;
import GameObjectGrafico.GameObjectGrafico;
import GameObjectGrafico.ObjetosGraficos.MagiaGrafico;
import Mapa.MapaLogico;

public abstract class Magia extends Objeto {
	protected int duracion;
	
	public Magia(MapaLogico mapaLogico, GameObjectGrafico aumentoDeDaņoGrafico, int duracion) {
		super(mapaLogico, aumentoDeDaņoGrafico);
		this.duracion= duracion;
	}
}
