package GameObject.Personajes.Enemigos;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Disparos.DisparoLogicoEnemigo;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;

public abstract class EnemigoDisparo extends Enemigo{
	
	protected EnemigoDisparo(MapaLogico ml, GameObjectGrafico gog, int m, int vida) {
		super(ml, gog, m, vida);
	}
	
	@Override
	public void atacarPersonaje(Personaje e) {
//		if (e.getX()>=this.getX()-100 && e.getX()<=getX() && e.getY()==this.getY()) {
//			super.mover(still_key);
//		}
		contador++;
		
		if (contador>=tiempo) {
			mapaLogico.disparoAAgregar(new DisparoLogicoEnemigo(mapaLogico, this), this.getX()-50, this.getY());
			contador=0;
		}	
	}
	
	@Override
	public boolean cambiarGrafico(Personaje e) {
		return estaEnRango(e);
	}
}