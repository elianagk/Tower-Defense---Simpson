package GameObjectGrafico.PersonajesGrafico.TorresGrafico;

import GameObjectGrafico.PersonajesGrafico.TorreGrafico;

public class HomeroGrafico extends TorreGrafico {

String direccionImg;
	
	public HomeroGrafico() {
		super("homeroparado.png");
	}
	
	public void setImagen(String img) {
		imagen = img;
	}
	
	public String getImagen() {
		return direccionImg;
	}
	
	@Override
	public void atacar() {
		super.atacar("homeroatacando.gif");
	}

	@Override
	public void accionar() {
		super.accionar("homeroparado.png");		
	}

	
}
