package GameObjectGrafico;

import java.awt.*;
import javax.swing.*;


public abstract class GameObjectGrafico extends JLabel {
	protected String imagen;
	protected String imagenatacando;
	
	
	public GameObjectGrafico(String s) {
		imagen= s;
		this.setIcon(new ImageIcon(getClass().getClassLoader().getResource(imagen)));
		
	}
	
	public abstract void cambiarPosicion() ; //cambia la posicion grafica, onda el dibujo
	
	public void setImagen(String img) {
		imagen = img;
	}
	
	public void setImagenAtacando(String s) {
		imagenatacando=s;
	}
	
	//public abstract void atacar(String s);
	
	
	
	
	
}
