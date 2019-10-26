package GameObject.Objetos.ObjetosPreciosos;

import javax.swing.JLabel;

import GRAFICA.MapaGrafico;
import GameObject.Objetos.HiloAnimacionPrecioso;

public class FuegoHilo extends HiloAnimacionPrecioso {

	public FuegoHilo(MapaGrafico mapa, JLabel j) {
		super(mapa, j);
		this.tiempo=3000;
	}

}
