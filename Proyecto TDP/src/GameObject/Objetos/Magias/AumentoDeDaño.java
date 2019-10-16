package GameObject.Objetos.Magias;

import GameObject.Objetos.Magia;
import GameObjectGrafico.ObjetosGraficos.MagiaGrafico;
import GameObjectGrafico.ObjetosGraficos.MagiasGraficas.AumentoDeDañoGrafico;
import Mapa.MapaLogico;

public class AumentoDeDaño extends Magia{

	public AumentoDeDaño(MapaLogico mapaLogico) {
		super(mapaLogico, new AumentoDeDañoGrafico(), 25);	//3°duracion seg
	}
}
