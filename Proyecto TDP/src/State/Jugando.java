package State;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import GRAFICA.MapaGrafico;
import GRAFICA.Mouse;
import Juego.Juego;
import Mapa.MapaLogico;


public class Jugando implements State {
	
	protected Juego juego;
	protected MapaGrafico mapaGrafico;
	protected MapaLogico mapaLogico;



	public Jugando(Juego j) {
		juego =j;
		mapaGrafico= juego.getMapaGrafico();
<<<<<<< HEAD
		mapaGrafico.setMouseListener(null);		//suponiendo que se inicializa el juego con este estado
=======
		mapaLogico= juego.getMapaL();
		mapaGrafico.setMouseListener(null);		//suponiendo que se inicializa el juego con este estado

>>>>>>> ab11875d121da54d93cb870d5d2a1968aa89de02
	}

	@Override
	public void actuar() {
		MouseListener mouseListener;
		mapaGrafico.removeMouseListener(mapaGrafico.getMouseListener());
		mapaGrafico.addMouseListener(mouseListener= new Mouse() {

		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	int x= e.getX();
		    	int y= e.getY();
		    	
		    	
		    }
		});
		
		mapaGrafico.setMouseListener(mouseListener);	
	}

	

}
