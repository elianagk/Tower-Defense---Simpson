package GameObject.Objetos.ObjetosPreciosos;

import javax.swing.JLabel;

import GRAFICA.MapaGrafico;
import GameObject.Objetos.HiloAnimacionPrecioso;
import Mapa.MapaLogico;

public class FuegoHilo extends HiloAnimacionPrecioso {

	public FuegoHilo(MapaLogico mapa, Fuego f) {
		super(mapa, f);
		this.tiempo=3000;
	}

}
