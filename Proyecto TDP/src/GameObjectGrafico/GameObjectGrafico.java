package GameObjectGrafico;

import java.awt.*;
import javax.swing.*;

import GameObject.Position;


public abstract class GameObjectGrafico extends JLabel {
	
	protected Position p;
	protected String imagen;
	
	public void setPosicion (int x, int y) {
		p.setPosition(x, y);
		
	}
	
	public abstract void cambiarPosicion();
	
	public void setImagen(String img) {
		imagen = img;
	}
	
	
	
}
