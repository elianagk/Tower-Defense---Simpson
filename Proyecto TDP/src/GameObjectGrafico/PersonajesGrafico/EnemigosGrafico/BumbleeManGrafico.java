package GameObjectGrafico.PersonajesGrafico.EnemigosGrafico;

import GameObjectGrafico.PersonajesGrafico.EnemigoGrafico;

public class BumbleeManGrafico extends EnemigoGrafico {

	public BumbleeManGrafico() {
		super("bmcaminando.gif");
		
	}
	
	public void atacar() {
		super.atacar("bmatacando.gif");
	}


	
	
}
