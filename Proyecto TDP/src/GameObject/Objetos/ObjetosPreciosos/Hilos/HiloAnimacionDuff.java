package GameObject.Objetos.ObjetosPreciosos.Hilos;

import javax.swing.JLabel;

import GRAFICA.MapaGrafico;
import GameObject.Objetos.ObjetoPrecioso;
import Mapa.MapaLogico;
import State.Jugando;

public abstract class HiloAnimacionDuff extends HiloAnimacionPrecioso {
	
	
	public HiloAnimacionDuff(MapaLogico mapa, ObjetoPrecioso g) {
		super(mapa, g);
		this.mapa= mapaLogico.getMapaGrafico();
		this.label =g.getGrafico();
		this.label.setBounds(miobjeto.getX(), miobjeto.getY(), 500, 450);
		
		
		
	}
	
	
	@SuppressWarnings("deprecation")
	public void run() {
		mapa.add(label);
		miobjeto.activar();
		
		try {
			Thread.sleep(tiempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		mapa.remove(label);;
		
		this.stop();
		mapaLogico.getJuego().cambiarEstado(new Jugando(mapaLogico.getJuego()));
	}
	
}