package GameObject.Personajes.Enemigos;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;

public abstract class EnemigoCuerpo extends Enemigo{
	
	protected EnemigoCuerpo(MapaLogico ml, GameObjectGrafico gog, int m, int vida) {
		super(ml, gog, m, vida);
	}

	@Override
	public void atacarPersonaje(Personaje e) {
		if (e.getX()>=this.getX()-100 && e.getX()<=getX() && e.getY()==this.getY()) {	
			contador++;
			if (contador>=tiempo) {						
				e.aplicarDaño(daño);	
				contador=0;
			}		
		}				
	}
	
	@Override
	public boolean cambiarGrafico(Personaje e) {
		return enContacto(e);
	}
	
}
