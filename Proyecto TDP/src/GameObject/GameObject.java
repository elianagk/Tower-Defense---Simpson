package GameObject;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.JLabel;

import GameObjectGrafico.GameObjectGrafico;

public abstract class GameObject {

	protected int vida;
	protected GameObjectGrafico miobjetografico;
	protected int x, y;	
	
	protected Icon image[];
	protected final int width = 32;
	protected final int height = 32;
	

	public GameObject() {
		
	}
	

	public JLabel getGrafico() {
		return miobjetografico;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public int getX () {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setImagen(String img) {
		miobjetografico.setImagen(img);
	}
	
	
	
	
	
}
