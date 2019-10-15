package GameObject.Objetos.ObjetosPreciosos;

import GameObject.Objetos.Magias.RejuvenecerGrafico;
import Mapa.MapaLogico;

public class SuperDuff {

	public SuperDuff(MapaLogico mapaLogico) {
		super(mapaLogico, new SuperDuffGrafico(), 200);	//3°vida
	}
}
