package GameObject.Objetos;

import javax.swing.JLabel;

import GRAFICA.MapaGrafico;
import GameObject.Objetos.ObjetosPreciosos.Bomba;
import Mapa.MapaLogico;

public class HiloAnimacionBomba extends HiloAnimacionPrecioso {
	protected JLabel label;
	protected MapaGrafico mapaGrafico;
	protected int tiempo;
	
	public HiloAnimacionBomba(MapaGrafico mapa, JLabel j) {
		super(mapa, j);
	}
	
	@Override
	@SuppressWarnings("deprecation")
	public void run() {
		
		
		try {
			Thread.sleep(tiempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		mapaGrafico.remove(label);
		
		this.stop();

	}

}
