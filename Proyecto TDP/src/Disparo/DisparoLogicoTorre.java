package Disparo;

import GameObject.GameObject;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;


public class DisparoLogicoTorre extends DisparoLogico {
	
	public DisparoLogicoTorre(MapaLogico ml) {
		super(ml, new DisparoGraficoTorre());
		
		
	}

	
	public void atacar(GameObject g) {
		
		mapaLogico.agregarEntidad(this, g.getX()+50, g.getY());
	}
	
	

	

}
