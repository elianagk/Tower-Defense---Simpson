package GameObjectGrafico.PersonajesGrafico.EnemigosGrafico;

import GameObjectGrafico.PersonajesGrafico.EnemigoGrafico;

public class MoeGrafico extends EnemigoGrafico {

	public	MoeGrafico() {
		super("moeatacando.gif");
		
	}

	public void atacar() {
		super.atacar("moeatacando.gif");
	}

	@Override
	public void accionar() {
		super.accionar("moeatacando.gif");
		
	}


}
