package GameObject.Objetos;

import GameObject.Objeto;
import GameObjectGrafico.ObjetosGraficos.MagiaGrafico;
import Mapa.MapaLogico;

public class Magia extends Objeto {

	public Magia(MapaLogico mapaLogico) {
		super(mapaLogico, new MagiaGrafico());
	}
}
