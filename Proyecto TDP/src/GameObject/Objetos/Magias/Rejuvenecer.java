package GameObject.Objetos.Magias;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.Magia;
import GameObjectGrafico.ObjetosGraficos.MagiasGraficas.RejuvenecerGrafico;
import Mapa.MapaLogico;

public class Rejuvenecer extends Magia {

	public Rejuvenecer(MapaLogico mapaLogico) {
		super(mapaLogico, new RejuvenecerGrafico(), 20);	//3°duracion seg
	}

	@Override
	public void accionar(Personaje c) {
		c.setVida(c.getVidaTotal());
		
	}
}
