package State;

import GRAFICA.MapaGrafico;
import Juego.Juego;
import Mapa.MapaLogico;


public class Jugando implements State {
	
	protected Juego juego;
	protected MapaGrafico mapaGrafico;



	public Jugando(Juego j) {
		juego =j;
		mapaGrafico= juego.getMapaGrafico();
		mapaGrafico.setMouseListener(null);		//suponiendo que se inicializa el juego con este estado
	}

	@Override
	public void actuar() {
		mapaGrafico.removeMouseListener(mapaGrafico.getMouseListener());
		mapaGrafico.setMouseListener(null);
	}

	

}
