package GameObjectGrafico.ObjetosGraficos.ObjetosPreciososGraficos;

import GameObject.Objeto;
import GameObjectGrafico.ObjetoGrafico;
import Mapa.MapaLogico;

public class DonaExplosivaGrafica extends ObjetoGrafico {

	public DonaExplosivaGrafica(MapaLogico ml) {
		super("fuego.png", ml);	
		this.setSize(100,100);
		
	}
	
}
