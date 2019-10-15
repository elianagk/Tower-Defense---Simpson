package GameObject.Objetos.ObjetosPreciosos;

import GameObject.Objetos.Magias.RejuvenecerGrafico;
import Mapa.MapaLogico;

public class AyudanteDeSanta {

	public AyudanteDeSanta(MapaLogico mapaLogico) {
		super(mapaLogico, new AyudanteDeSantaGrafico(), 100);	//3°vida
	}
}
