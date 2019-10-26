package GameObject.Objetos;

import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Objeto;
import GameObjectGrafico.GameObjectGrafico;
import GameObjectGrafico.ObjetosGraficos.ObjetoPreciosoGrafico;
import Mapa.MapaLogico;

public abstract class ObjetoPrecioso extends Objeto {
	protected int vida;
	protected HiloAnimacionPrecioso hilo;
	
	public ObjetoPrecioso(MapaLogico mapaLogico, GameObjectGrafico objP, int vida) {
		super(mapaLogico, objP);
		this.vida=vida;
	}
	
	
	public abstract void empezarHilo() ;
	
}
