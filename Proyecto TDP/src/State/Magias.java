package State;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import GRAFICA.MapaGrafico;
import GRAFICA.Mouse;

import Juego.Juego;

public class Magias implements State{
	protected MapaGrafico mapaGrafico;
	protected Juego juego;
	
	public Magias(Juego j) {
		juego=j;
		mapaGrafico= juego.getMapaGrafico();
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

		    	if(y>=170 && y<=800) {
		    		mapaGrafico.avisarTienda((x/100)*100, (y/100)*100);
		    		juego.setJugar();

		    	}
		    	
		    }
		});
		mapaGrafico.setMouseListener(mouseListener);	
		
	}

}