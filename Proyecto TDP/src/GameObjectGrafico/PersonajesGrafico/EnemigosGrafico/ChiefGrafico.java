package GameObjectGrafico.PersonajesGrafico.EnemigosGrafico;

import GameObjectGrafico.PersonajesGrafico.EnemigoGrafico;

public class ChiefGrafico extends EnemigoGrafico {

	public ChiefGrafico() {
		super("chiefcaminando.gif");
		
	}
	
	public void atacar() {
		super.atacar("chiefatacando.gif");
	}

	@Override
	public void accionar() {
		super.accionar("chiefcaminando.gif");
		
	}

	
	

}
