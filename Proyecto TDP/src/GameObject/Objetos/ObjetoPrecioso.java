package GameObject.Objetos;

import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Objeto;
import GameObject.Personaje;
import GameObjectGrafico.GameObjectGrafico;
import GameObjectGrafico.ObjetosGraficos.ObjetoPreciosoGrafico;
import Mapa.MapaLogico;

public abstract class ObjetoPrecioso extends Objeto {
	protected HiloAnimacionPrecioso hilo;
	
	public ObjetoPrecioso(MapaLogico mapaLogico, GameObjectGrafico objP, int vida) {
		super(mapaLogico, objP);
		this.vida=vida;
	}
	
	public abstract void accionar(Personaje c);
	
	public  void empezarHilo() {
		hilo.start();
	}
	
	public abstract void activar();
	
	
	public int getCosto() {
		return costo;
	}
}
