package State;

import GRAFICA.MapaGrafico;
import Juego.Juego;
import Mapa.MapaLogico;


public class Jugando extends State {
	
	protected Juego juego;
	protected MapaGrafico mapa;



	public Jugando(Juego j) {
		juego =j;
		mapa=juego.getMapag();
		actualMouseListener=null;		//suponiendo que se inicializa el juego con este estado

	}

	@Override
	public void actuar() {
		mapa.removeMouseListener(actualMouseListener);
		actualMouseListener=null;
	}

	

}
