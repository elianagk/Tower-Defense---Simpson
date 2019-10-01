package GameObject;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.JLabel;

import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public abstract class GameObject {

	protected int vida;
	protected GameObjectGrafico miObjetoGrafico;
	protected Point posicion;
	
	protected MapaLogico mapaLogico;
	
	protected Icon image[];// imagen statica, gif caminando, gif atacando
	protected final int width = 50;
	protected final int height = 50;
	
	public static final String jump_key = "Jump";
	public static final String forward_key = "Froward";
	public static  final String backward_key = "Backward";
	public static  final String still_key = "Still";
	
	protected String last_dir = "";
	

	public GameObject(MapaLogico ml, GameObjectGrafico gog) {
		posicion= null;
		mapaLogico= ml;
		miObjetoGrafico= gog;
//		mapaLogico.agregarEntidad(this, (int)posicion.getX(), (int)posicion.getY());
	}
	
//	public void agregarEntidad() {
//		mapaLogico.agregarEntidad(this, (int)posicion.getX(), (int)posicion.getY());
//	}
	
	public JLabel getGrafico() {
		last_dir= still_key;
		return miObjetoGrafico;
	}
	
	public void setPosicion(Point p) {
		posicion=p;
	}
	
	public Point getPosicion() {
		return posicion;
	}
	
	public int getX() {
		return posicion.x;
	}
	public int getY() {
		return posicion.y;
	}
	
	public void setX(int x) {
		posicion.x=x;
	}
	
	public void setY(int y) {
		posicion.y=y;
	}
	
	public void setImagen(String img) {
		miObjetoGrafico.setImagen(img);
	}
	
	public abstract GameObject clone();
	
	public abstract void Aceptar(Visitor visitante) ;
	
	public void setVida(int vida) {
		this.vida=vida;
	}
	
	public int getVida() {
		return vida;
	}
	
}
