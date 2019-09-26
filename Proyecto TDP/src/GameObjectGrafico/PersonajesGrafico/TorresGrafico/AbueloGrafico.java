package GameObjectGrafico.PersonajesGrafico.TorresGrafico;

import GameObjectGrafico.PersonajesGrafico.TorreGrafico;

public class AbueloGrafico extends TorreGrafico {

String direccionImg;
	
	public AbueloGrafico() {
		super("abe.gif");
	}
	
	public void setImagen(String img) {
		imagen = img;
	}
	
	public String getImagen() {
		return direccionImg;
	}
}
