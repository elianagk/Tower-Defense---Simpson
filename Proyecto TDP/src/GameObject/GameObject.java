package GameObject;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.text.Position;

import GameObjectGrafico.GameObjectGrafico;

public abstract class GameObject {

	protected int vida;
	protected GameObjectGrafico miobjetografico;
	protected Point position;
	
	protected Icon image[];
	protected final int width = 50;
	protected final int height = 50;
	
	public static final String jump_key = "Jump";
	public static final String forward_key = "Froward";
	public static  final String backward_key = "Backward";
	public static  final String still_key = "Still";
	
	protected String last_dir = "";
	

	public GameObject() {
		
	}
	

	public JLabel getGrafico() {
		last_dir= still_key;
		return miobjetografico;
	}
	
	public void setPosicion(Point p) {
		position=p;
	}
	
	public Point getPosicion() {
		return position;
	}
	
	public int getX() {
		return position.x;
	}
	public int getY() {
		return position.y;
	}
	
	public void setX(int x) {
		position.x=x;
	}
	
	public void setY(int y) {
		position.y=y;
	}
	
	public void setImagen(String img) {
		miobjetografico.setImagen(img);
	}
	
	public abstract GameObject clone();
	
	
	
}
