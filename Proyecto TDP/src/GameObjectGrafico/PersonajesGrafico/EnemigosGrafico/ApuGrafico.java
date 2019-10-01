package GameObjectGrafico.PersonajesGrafico.EnemigosGrafico;

import javax.swing.ImageIcon;

import GameObjectGrafico.PersonajesGrafico.EnemigoGrafico;

public class ApuGrafico extends EnemigoGrafico {
	
	public ApuGrafico() {
		super ("apucaminandogif.gif");
		
	}

	
	
	public void cambiarPosicion() {
		this.setImagen("apucaminandogif.gif");
		this.setIcon(new ImageIcon(getClass().getClassLoader().getResource(imagen)));
	}
	
	
	
	public void atacar() {
		super.atacar("apugif.gif");
	}

	
	

}
