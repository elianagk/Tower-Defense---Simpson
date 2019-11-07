package GameObject.Objetos.ObjetosPreciosos;

import javax.swing.JLabel;

import GRAFICA.MapaGrafico;
import GameObject.Objetos.HiloAnimacionPrecioso;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;

public class BombaHilo extends HiloAnimacionPrecioso {
	

	public BombaHilo(MapaLogico mapa, Bomba b) {
		super(mapa, b);
		this.tiempo=100;
		
	}

}
