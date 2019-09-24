package GameObjectGrafico;

import java.awt.*;
import javax.swing.*;


public abstract class GameObjectGrafico extends JLabel {
	protected String imagen;
	
	
	public GameObjectGrafico(String s) {
		imagen= s;
		this.setIcon(new ImageIcon(getClass().getClassLoader().getResource(imagen)));
		
	}
	
	public abstract void cambiarPosicion() ; //cambia la posicion grafica, onda el dibujo
	
	public void setImagen(String img) {
		imagen = img;
	}
	
	
	
}
