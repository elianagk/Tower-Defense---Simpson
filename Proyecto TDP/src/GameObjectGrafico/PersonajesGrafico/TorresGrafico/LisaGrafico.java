package GameObjectGrafico.PersonajesGrafico.TorresGrafico;

import GameObjectGrafico.PersonajesGrafico.TorreGrafico;

public class LisaGrafico extends TorreGrafico {

String direccionImg;
	
	public LisaGrafico() {
		super("lisa.png");
	}
	
	public void setImagen(String img) {
		imagen = img;
	}
	
	public String getImagen() {
		return direccionImg;
	}

}
