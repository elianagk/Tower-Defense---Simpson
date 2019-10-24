package GameObject;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.JLabel;

import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;

import VISITOR.Visitor;

public abstract class GameObject {

	protected int vida, vidaTotal,costo;
	protected GameObjectGrafico miObjetoGrafico;
	protected Point posicion;
	protected Visitor visitor;
	protected boolean esValido;		//para determinar si es valido hacer operaciones con el objeto

	protected MapaLogico mapaLogico;

	;// imagen statica, gif caminando, gif atacando
	protected final int width = 50;
	protected final int height = 50;

	public static final String jump_key = "Jump";
	public static final String forward_key = "Froward";
	public static final String backward_key = "Backward";
	public static final String still_key = "Still";

	protected String last_dir = "";
	

	public GameObject(MapaLogico ml, GameObjectGrafico gog) {
		posicion = null;
		mapaLogico = ml;
		miObjetoGrafico = gog;
		esValido=true;
	}

	public void setPosicion(Point p) {
		posicion = p;
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
		posicion.x = x;
	}

	public void setY(int y) {
		posicion.y = y;
	}

	public void setImagen(String img) {
		miObjetoGrafico.setImagen(img);
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public int getVida() {
		return vida;
	}
	
	public int getVidaTotal() {
		return vidaTotal;
	}
	
	public boolean getEsValido() {
		return esValido;
	}
	
	public void setEsValido(boolean valido) {
		esValido=valido;
	}
	
	public JLabel getGrafico() {
		last_dir= still_key;
		return miObjetoGrafico;
	}
	
	public Visitor getVisitor() {	
		return visitor ;
	}
	
	public int getCosto() {
		return costo;
	}
	
	public void gameOver() {
		mapaLogico.gameOver();
	}
	
	public abstract void Aceptar(Visitor v);
	
	public abstract GameObject clone();
	
	public abstract void accionar();
	
	
}
