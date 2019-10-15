package GameObject.Objetos.Magias;

import GameObject.Objetos.Magia;
import GameObjectGrafico.ObjetosGraficos.MagiaGrafico;
import Mapa.MapaLogico;

public class AumentoDeDa�o extends Magia{

	public AumentoDeDa�o(MapaLogico mapaLogico) {
		super(mapaLogico, new AumentoDeDa�oGrafico(), 25);	//3�duracion seg
	}
}
