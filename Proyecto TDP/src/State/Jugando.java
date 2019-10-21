package State;

import Mapa.MapaLogico;

public class Jugando extends State {
	protected MapaLogico mapa;
	
	public Jugando(MapaLogico mapa) {
		this.mapa= mapa;
		actualMouseListener=null;		//suponiendo que se inicializa el juego con este estado
	}

	@Override
	public void actuar() {
		mapa.getMapaGrafico().removeMouseListener(actualMouseListener);
		actualMouseListener=null;
	}

	

}
