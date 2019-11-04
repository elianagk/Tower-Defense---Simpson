package GameObject.Objetos.ObjetosPreciosos;

import javax.swing.JLabel;

import GRAFICA.MapaGrafico;
import GameObject.Objetos.HiloAnimacionPrecioso;
import Mapa.MapaLogico;

public class DuffHilo extends HiloAnimacionPrecioso {

	public DuffHilo(MapaLogico mapa, SuperDuff d) {
		super(mapa, d);
		this.tiempo=10000;
	}

}
