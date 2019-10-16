package GameObject.Objetos.Magias;

import GameObjectGrafico.ObjetosGraficos.MagiasGraficas.RejuvenecerGrafico;
import Mapa.MapaLogico;

public class Rejuvenecer {

	public Rejuvenecer(MapaLogico mapaLogico) {
		super(mapaLogico, new RejuvenecerGrafico(), 20);	//3°duracion seg
	}
}
