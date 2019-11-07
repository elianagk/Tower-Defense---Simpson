package GameObject.Objetos.ObjetosPreciosos.Hilos;

import javax.swing.JLabel;

import GRAFICA.MapaGrafico;
import GameObject.Objetos.ObjetosPreciosos.Fuego;
import Mapa.MapaLogico;

public class FuegoHilo extends HiloAnimacionPrecioso {

	public FuegoHilo(MapaLogico mapa, Fuego f) {
		super(mapa, f);
		this.tiempo=3000;
	}

}
