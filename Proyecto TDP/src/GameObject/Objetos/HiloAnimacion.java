package GameObject.Objetos;

import javax.swing.JLabel;

import GRAFICA.MapaGrafico;
import Mapa.MapaLogico;

public class HiloAnimacion extends Thread {
	
	protected MapaLogico mapaLogico;
	protected MapaGrafico mapa;
	protected JLabel label;
	protected int tiempo;
	
	public HiloAnimacion(MapaGrafico mapa, JLabel j) {
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
		
		mapa.remove(label);
		this.stop();

	}
}