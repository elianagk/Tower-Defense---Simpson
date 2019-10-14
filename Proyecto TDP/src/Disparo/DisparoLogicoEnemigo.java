package Disparo;

import GameObject.GameObject;
import Mapa.MapaLogico;


public class DisparoLogicoEnemigo extends DisparoLogico {
	
	public DisparoLogicoEnemigo(MapaLogico ml) {
		super(ml, new DisparoGraficoEnemigo());
		
	}



	@Override
	public void atacar(GameObject g) {
		mapaLogico.agregarEntidad(this, g.getX()-100, g.getY());
		
	}

}
