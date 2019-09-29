package GameObjectGrafico.PersonajesGrafico.TorresGrafico;

import GameObjectGrafico.PersonajesGrafico.TorreGrafico;

public class HomeroGrafico extends TorreGrafico {

String direccionImg;
	
	public HomeroGrafico() {
		super("homero.jpg");
	}
	
	public void setImagen(String img) {
		imagen = img;
	}
	
	public String getImagen() {
		return direccionImg;
	}
	
}
