package GameObject.Objetos;

import javax.swing.JLabel;

import GRAFICA.MapaGrafico;
import Mapa.MapaLogico;


public abstract class HiloAnimacionMagias extends Thread {
	
	protected MapaLogico mapaLogico;
	protected MapaGrafico mapa;
	protected JLabel label;
	protected int tiempo;
	protected Magia magia;
	
	public HiloAnimacionMagias(Magia magia) {
		this.magia=magia;
		
		
	}
	
	@SuppressWarnings("deprecation")
	public void run() {
		
		
		try {
			Thread.sleep(tiempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		magia.terminarMagia();
		this.stop();

	}
}