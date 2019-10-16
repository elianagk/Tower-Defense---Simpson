package GameObject.Objetos.ObjetosPreciosos;

import GameObjectGrafico.ObjetosGraficos.ObjetosPreciososGraficos.AyudanteDeSantaGrafico;
import Mapa.MapaLogico;

public class AyudanteDeSanta {

	public AyudanteDeSanta(MapaLogico mapaLogico) {
		super(mapaLogico, new AyudanteDeSantaGrafico(), 100);	//3°vida
	}
}
