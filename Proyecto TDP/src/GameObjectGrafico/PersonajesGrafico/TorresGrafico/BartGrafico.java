package GameObjectGrafico.PersonajesGrafico.TorresGrafico;

import javax.swing.ImageIcon;

import GameObjectGrafico.PersonajesGrafico.TorreGrafico;

public class BartGrafico extends TorreGrafico {
	String direccionImg;
	
	public BartGrafico() {
		super("bartt.png");
	}
	
	public void setImagen(String img) {
		imagen = img;
	}
	
	public String getImagen() {
		return direccionImg;
	}
	
	public void atacar() {
		super.atacar("bartatacando.gif");
	}

}
