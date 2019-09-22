package GameObjectGrafico;

import java.awt.*;
import javax.swing.*;


public abstract class GameObjectGrafico extends JLabel {
	protected String imagen;
	
	public abstract void cambiarPosicion();
	
	public void setImagen(String img) {
		imagen = img;
	}
	
	
	
}
