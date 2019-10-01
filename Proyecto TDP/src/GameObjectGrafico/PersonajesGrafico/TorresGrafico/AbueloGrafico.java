package GameObjectGrafico.PersonajesGrafico.TorresGrafico;

import GameObjectGrafico.PersonajesGrafico.TorreGrafico;

public class AbueloGrafico extends TorreGrafico {

String direccionImg;
	
	public AbueloGrafico() {
		super("abe1.png");
	}
	
	public void setImagen(String img) {
		imagen = img;
	}
	
	public String getImagen() {
		return direccionImg;
	}
	
	public void atacar() {
		super.atacar("abeatacando.gif");
	}
}
