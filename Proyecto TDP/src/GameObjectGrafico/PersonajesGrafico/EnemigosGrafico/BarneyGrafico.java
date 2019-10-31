package GameObjectGrafico.PersonajesGrafico.EnemigosGrafico;

import GameObjectGrafico.PersonajesGrafico.EnemigoGrafico;

public class BarneyGrafico extends EnemigoGrafico {

	public BarneyGrafico() {
		super("barneycaminando.gif");
		
	}
	
	public void atacar() {
		super.atacar("barneyatacando3.gif");
	}

	@Override
	public void accionar() {
		super.accionar("barneycaminando.gif");
		
	}


	
	
}
