package GameObject.Objetos;

import javax.swing.JLabel;

import Mapa.MapaLogico;

public class HiloAnimacion extends Thread {
	
	protected MapaLogico mapaLogico;
	protected JLabel label;
	protected int tiempo;
	
	public HiloAnimacion(MapaLogico mapaLogico, JLabel j) {
		this.mapaLogico = mapaLogico;
		this.label =j;
	}
	
	@SuppressWarnings("deprecation")
	public void run() {
		mapaLogico.getMapaGrafico().add(label);
		
		try {
			Thread.sleep(tiempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		mapaLogico.getMapaGrafico().remove(label);
		this.stop();

	}
}