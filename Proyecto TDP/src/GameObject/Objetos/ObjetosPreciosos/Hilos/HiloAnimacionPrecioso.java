package GameObject.Objetos.ObjetosPreciosos.Hilos;

import javax.swing.JLabel;

import GRAFICA.MapaGrafico;
import GameObject.GameObject;
import GameObject.Objetos.ObjetoPrecioso;
import Mapa.MapaLogico;
import State.Jugando;

public abstract class HiloAnimacionPrecioso extends Thread {
	
	protected MapaLogico mapaLogico;
	protected MapaGrafico mapa;
	protected JLabel label;
	protected int tiempo;
	protected ObjetoPrecioso miobjeto;
	protected volatile boolean flag= false;
	
	public HiloAnimacionPrecioso(MapaLogico mapa, ObjetoPrecioso g) {
		mapaLogico=mapa;
		this.mapa= mapaLogico.getMapaGrafico();
		miobjeto=g;
		
		//this.label.setBounds(miobjeto.getX(), miobjeto.getY(), 200, 200);
		
		
		
	}
	
	
	
	
	@SuppressWarnings("deprecation")
	public void run() {
		mapaLogico.entidadAAgregar(miobjeto, miobjeto.getX(), miobjeto.getY());
		
		
			try {
				Thread.sleep(tiempo);
				miobjeto.accionar();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		
		mapaLogico.entidadAEliminar(miobjeto);
		//mapaLogico.getJuego().cambiarEstado(new Jugando(mapaLogico.getJuego()));
		
		this.stop();
		this.destroy();
	}
	
	
	public void stopRunning() {
		flag= true;
	}
	
	
	
}