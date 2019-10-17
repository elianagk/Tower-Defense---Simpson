package GameObjectGrafico.PersonajesGrafico.EnemigosGrafico;

import GameObjectGrafico.PersonajesGrafico.EnemigoGrafico;

public class MrBurnsGrafico extends EnemigoGrafico {

	public MrBurnsGrafico() {
		super("burnscaminando.gif");
		
	}
	
	public void atacar() {
		super.atacar("bursnatacando.gif");
	}

	
	

}
