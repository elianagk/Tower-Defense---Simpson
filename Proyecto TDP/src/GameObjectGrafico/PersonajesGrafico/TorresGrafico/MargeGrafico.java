package GameObjectGrafico.PersonajesGrafico.TorresGrafico;

import GameObjectGrafico.PersonajesGrafico.TorreGrafico;

public class MargeGrafico extends TorreGrafico {

String direccionImg;
	
	public MargeGrafico() {
		super("margeatacando.gif");
	}
	
	public void setImagen(String img) {
		imagen = img;
	}
	
	public String getImagen() {
		return direccionImg;
	}
	
	public void atacar() {
		super.atacar("margeatacando.gif");
	}

	@Override
	public void accionar() {
		this.atacar();
		
	}

	

	
}
