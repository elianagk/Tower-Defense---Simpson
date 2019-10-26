package GameObject.Objetos.ObjetosPreciosos;

import javax.swing.JLabel;

import GRAFICA.MapaGrafico;
import GameObject.Objetos.HiloAnimacionPrecioso;

public class DuffHilo extends HiloAnimacionPrecioso {

	public DuffHilo(MapaGrafico mapa, JLabel j) {
		super(mapa, j);
		this.tiempo=10000;
	}

}
