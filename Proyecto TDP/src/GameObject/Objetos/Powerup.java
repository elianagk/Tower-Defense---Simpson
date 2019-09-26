package GameObject.Objetos;

import GameObject.Objeto;
import GameObjectGrafico.ObjetosGraficos.PowerupGrafico;
import Mapa.MapaLogico;

public class Powerup extends Objeto {

	public Powerup(MapaLogico mapaLogico) {
		super(mapaLogico, new PowerupGrafico());
	}
}
