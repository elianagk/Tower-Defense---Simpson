package GameObject.Objetos.ObjetosPreciosos.Hilos;

import javax.swing.JLabel;

import GRAFICA.MapaGrafico;
import GameObject.Objetos.ObjetosPreciosos.SuperDuff;
import Mapa.MapaLogico;

public class DuffHilo extends HiloAnimacionDuff {

	public DuffHilo(MapaLogico mapa, SuperDuff d) {
		super(mapa, d);
		this.tiempo=4000;
	}

}
