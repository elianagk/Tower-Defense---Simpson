package GameObject.Personajes.Torres;

import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObject.Personajes.Disparos.DisparoLogicoTorre;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;

public abstract class TorreDisparo extends Torre {
	
	public TorreDisparo(MapaLogico mapaLogico, GameObjectGrafico gog, int vida) {
		super(mapaLogico, gog, vida);
	}

	@Override
	public void atacarPersonaje(Personaje e) {
//		miObjetoGrafico.atacar();
		contador++;
		
		if (contador==tiempo) {
			mapaLogico.disparoAAgregar(new DisparoLogicoTorre(mapaLogico, this), this.getX()+50, this.getY());
			contador=0;
		}
	}
	
	@Override
	public boolean cambiarGrafico(Personaje e) {
		return estaEnRango(e);
	}
}
