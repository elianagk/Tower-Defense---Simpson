package GameObject.Objetos.ObjetosPreciosos.Hilos;

import javax.swing.JLabel;

import GRAFICA.MapaGrafico;
import GameObject.Objetos.ObjetosPreciosos.Bomba;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;

public class BombaHilo extends HiloAnimacionPrecioso {
	

	public BombaHilo(MapaLogico mapa, Bomba b) {
		super(mapa, b);
		this.tiempo=1500;
		

		
	}

}
