package State;

import GRAFICA.MapaGrafico;
import Juego.Juego;
import Mapa.MapaLogico;

public class Jugando implements State {
	protected Juego juego;
	protected MapaGrafico mapa;
	
	public Jugando(Juego j) {
		juego=j;
		mapa= j.getMapag();
	}

	@Override
	public void actuar() {
		
		
	}

	

}
