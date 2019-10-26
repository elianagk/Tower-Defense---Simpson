package GameObject.Objetos;

import javax.swing.JLabel;

import GRAFICA.MapaGrafico;
import Mapa.MapaLogico;

public abstract class HiloAnimacionPrecioso extends Thread {
	
	protected MapaLogico mapaLogico;
	protected MapaGrafico mapa;
	protected JLabel label;
	protected int tiempo;
	
	public HiloAnimacionPrecioso(MapaGrafico mapa, JLabel j) {
		this.mapa= mapa;
		this.label =j;
		
	}
	
	@SuppressWarnings("deprecation")
	public void run() {
		mapa.add(label);
		
		try {
			Thread.sleep(tiempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		this.stop();

	}
}