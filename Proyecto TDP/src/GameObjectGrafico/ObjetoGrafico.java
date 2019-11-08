package GameObjectGrafico;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import GameObject.Objeto;
import Mapa.MapaLogico;

public abstract class ObjetoGrafico extends GameObjectGrafico {
	protected MapaLogico mapaLogico;
	
	
	public ObjetoGrafico(String s, MapaLogico ml) {
		super(s);
		mapaLogico= ml;
	}

	public  void accionar() {}
	
	public void atacar() {}

	
}
