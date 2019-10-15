package GameObject.Objetos.Magias;

import GameObject.Objetos.Magia;
import GameObjectGrafico.ObjetosGraficos.MagiaGrafico;
import Mapa.MapaLogico;

public class AumentoDeDaņo extends Magia{

	public AumentoDeDaņo(MapaLogico mapaLogico) {
		super(mapaLogico, new AumentoDeDaņoGrafico(), 25);	//3°duracion seg
	}
}
