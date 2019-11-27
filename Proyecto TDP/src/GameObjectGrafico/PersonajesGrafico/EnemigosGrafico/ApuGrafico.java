package GameObjectGrafico.PersonajesGrafico.EnemigosGrafico;

import javax.swing.ImageIcon;

import GameObjectGrafico.PersonajesGrafico.EnemigoGrafico;

public class ApuGrafico extends EnemigoGrafico {
	
	public ApuGrafico() {
		super ("apucaminandogif.gif");
		
	}
	
	public void atacar() {
		super.atacar("apuatacando.gif");
	}

	@Override
	public void accionar() {
		super.accionar("apucaminandogif.gif");	
	}	

}
