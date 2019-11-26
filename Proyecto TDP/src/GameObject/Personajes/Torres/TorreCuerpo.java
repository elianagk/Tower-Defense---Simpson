package GameObject.Personajes.Torres;

import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;

public abstract class TorreCuerpo extends Torre {
	
	public TorreCuerpo(MapaLogico mapaLogico, GameObjectGrafico gog, int vida) {
		super(mapaLogico, gog, vida);
	}

	@Override
	public void atacarPersonaje(Personaje e) {
//		accionar=false;			
//		miObjetoGrafico.atacar();	
		contador++;
		
		if (contador>=tiempo) {						
			e.aplicarDaño(daño);	
			contador=0;
		}		
		
//		if (!e.getEsValido()) { 
//			accionar=true;		
//			mover(still_key);
//		}
	}
}
