package GameObject;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.JLabel;

import GameObjectGrafico.GameObjectGrafico;

public abstract class GameObject {

	protected int vida;
	protected GameObjectGrafico miobjetografico;
	protected Point pos;
	
	
	protected Icon image[];
	protected final int width = 32;
	protected final int height = 32;
	
	protected int velocidad;
	
	
	public JLabel getGrafico() {
		return miobjetografico;
	}
	
	public Point getPosition() {
		return pos;
	}
	
	public void setPosition(int x, int y) {
		pos.setLocation(x, y);
	}
	
	public void setImagen(String img) {
		miobjetografico.setImagen(img);
	}
	
	
	
	
	
}
