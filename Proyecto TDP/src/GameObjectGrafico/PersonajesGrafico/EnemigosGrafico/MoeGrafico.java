package GameObjectGrafico.PersonajesGrafico.EnemigosGrafico;

import GameObjectGrafico.PersonajesGrafico.EnemigoGrafico;

public class MoeGrafico extends EnemigoGrafico {

	public	MoeGrafico() {
		super("moecaminando.gif");
		
	}
	
	public void atacar() {
		super.atacar("moeatacando.png");
	}


}
