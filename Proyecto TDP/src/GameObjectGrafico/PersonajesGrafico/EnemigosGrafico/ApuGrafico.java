package GameObjectGrafico.PersonajesGrafico.EnemigosGrafico;

import javax.swing.ImageIcon;

import GameObjectGrafico.PersonajesGrafico.EnemigoGrafico;

public class ApuGrafico extends EnemigoGrafico {
	
	public ApuGrafico() {
		this.setImagen("apu1.png");
		this.setIcon(new ImageIcon(getClass().getClassLoader().getResource(imagen)));
	}

	
	
	public void cambiarPosicion() {
		this.setImagen("apu2.png");
		this.setIcon(new ImageIcon(getClass().getClassLoader().getResource(imagen)));
	}
	
	
	
	public void avanzar() {
		
	}
	
	

}
