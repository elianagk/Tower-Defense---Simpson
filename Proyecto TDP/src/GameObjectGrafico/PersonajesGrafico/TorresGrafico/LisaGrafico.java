package GameObjectGrafico.PersonajesGrafico.TorresGrafico;

import GameObjectGrafico.PersonajesGrafico.TorreGrafico;

public class LisaGrafico extends TorreGrafico {

String direccionImg;
	
	public LisaGrafico() {
		super("lisa1.png");
	}
	
	public void setImagen(String img) {
		imagen = img;
	}
	
	public String getImagen() {
		return direccionImg;
	}
	
	public void atacar() {
		super.atacar("lisaatacando.gif");
	}

	@Override
	public void accionar() {
		super.accionar("lisa1.png");
		
	}


}
