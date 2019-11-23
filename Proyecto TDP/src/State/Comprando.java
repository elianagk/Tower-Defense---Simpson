package State;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import GRAFICA.MapaGrafico;
import GRAFICA.Mouse;
import Juego.Juego;
import Mapa.MapaLogico;

public class Comprando implements State {
	
	protected Juego juego;
	protected MapaGrafico mapaGrafico;
	
	public Comprando(Juego j) {
		juego=j;
		mapaGrafico= j.getMapaGrafico();
	}


	public void actuar() {
		MouseListener mouseListener;
		mapaGrafico.removeMouseListener(mapaGrafico.getMouseListener());
		mapaGrafico.addMouseListener(mouseListener= new Mouse() {

		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	int x= e.getX();
		    	int y= e.getY();
		    	int verdaderoy=0;
		    	if(y>=170 && y<=800) {
		    		if (y>200 && y<300) {
		    			verdaderoy=200;
		    		}
		    		else {
		    			if (y>300 && y<400) {
		    				verdaderoy=300;
		    			}
		    			else {
		    				if (y>400 && y<500) {
		    					verdaderoy=400;
		    				}
		    				else {
		    					if (y>500 && y<600) {
		    						verdaderoy=500;
		    					}
		    					else {
		    						if (y>600 && y<700) {
		    							verdaderoy=600;
		    						}
		    						else {
		    							if (y>700 && y<800) {
		    								verdaderoy=700;
		    							}
		    						}
		    					}
		    				}
		    			}
		    		}		
		    		mapaGrafico.avisarTienda((x/100)*100,(verdaderoy*100)/100);
		    		
		    		//juego.cambiarEstado(new Jugando(juego));

		    	}
		    	
		    	juego.cambiarEstado(new Jugando(juego));
		    	 ((Component) e.getSource()).removeMouseListener(this);
		    }
		});
		mapaGrafico.setMouseListener(mouseListener);	
		
	}
	
	
	

	

}
