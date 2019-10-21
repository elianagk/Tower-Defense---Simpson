package State;

import java.awt.event.MouseEvent;
import java.util.Random;

import GRAFICA.MapaGrafico;
import GRAFICA.Mouse;
import Juego.Juego;
import Mapa.MapaLogico;

public class Comprando implements State {
	
	protected Juego juego;
	protected MapaGrafico mapa;
	
	public Comprando(Juego j) {
		juego=j;
		mapa= j.getMapag();
	}

	@Override
	public void actuar() {
		mapa.addMouseListener(new Mouse() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	int x= e.getX();
		    	int y= e.getY();
		    	if( y>=300 && y<=600) 
		    		mapa.avisarTienda((x/100)*100, (y/100)*100);
		    	
		    }
		});
		
		juego.setJugar();
		
	}
	
	
	

	

}
