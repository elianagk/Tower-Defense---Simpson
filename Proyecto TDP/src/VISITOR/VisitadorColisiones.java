package VISITOR;

import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;
import Mapa.MapaLogico;

public class VisitadorColisiones implements Visitor {
	private MapaLogico mapa;
	

	@Override
	public void visitar(Enemigo e) {
		if (mapa.HayColisiones(e.getX(), e.getY())) {
			
		}
		
	}

	@Override
	public void visitar(Torre t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(Object o) {
		// TODO Auto-generated method stub
		
	}

}
