package GameObject.Objetos;

import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Objetos.ObjetosPreciosos.Hilos.HiloAnimacionPrecioso;
import GameObject.Objeto;
import GameObject.Personaje;
import GameObjectGrafico.GameObjectGrafico;
import GameObjectGrafico.ObjetosGraficos.ObjetoPreciosoGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public abstract class ObjetoPrecioso extends ObjetosSinMagia {
	protected HiloAnimacionPrecioso hilo;
	protected Visitor visitor;
	
	public ObjetoPrecioso(MapaLogico mapaLogico, GameObjectGrafico objP) {
		super(mapaLogico, objP);
		
	}
	
	
	public void accionar(Personaje c) {
		mapaLogico.entidadAEliminar(c);
	}
	
	public abstract void empezarHilo();
	
	public void accionar() {
		
	}
	
	
	
}
