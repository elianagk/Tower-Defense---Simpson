package GameObject.Objetos.ObjetosPreciosos.Hilos;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import GRAFICA.MapaGrafico;
import GameObject.Objetos.ObjetoPrecioso;
import Mapa.MapaLogico;
import State.Jugando;

public abstract class HiloAnimacionDuff extends HiloAnimacionPrecioso {
	
	
	public HiloAnimacionDuff(MapaLogico mapa, ObjetoPrecioso g) {
		super(mapa, g);
		this.mapa= mapaLogico.getMapaGrafico();
		this.label =miobjeto.getGrafico();
		
		Icon icon = label.getIcon();
		this.label.setIcon(icon);
		this.label.setSize(200, 100);
		this.label.setBounds(miobjeto.getX(), miobjeto.getY(), 200, 100);
	}
	
	
	@SuppressWarnings("deprecation")
	public void run() {
		mapaLogico.entidadAAgregar(miobjeto, miobjeto.getX(), miobjeto.getY());
		miobjeto.accionar();
		
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