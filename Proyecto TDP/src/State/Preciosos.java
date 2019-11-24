package State;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import GRAFICA.MapaGrafico;
import GRAFICA.Mouse;
import GameObject.Objetos.Magia;
import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Objetos.ObjetosSinMagia;
import Juego.Juego;

public class Preciosos implements State {
	protected Juego juego;
	protected MapaGrafico mapaGrafico;
	protected ObjetoPrecioso miobjeto;
	
	public Preciosos(Juego j, ObjetoPrecioso o) {
		juego=j;
		mapaGrafico= j.getMapaGrafico();
		miobjeto=o;
		
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
		    		if (mapaGrafico.getTiendaLogica().sePuedeComprar(miobjeto.getCosto())) {
			    		Point p= new Point(x, verdaderoy);
				    	miobjeto.setPosicion(p);
				    	juego.getJugador().setMonedas(juego.getJugador().getMonedas()-miobjeto.getCosto());
				    	juego.getMapaL().getTiendaLogica().actualizarPlata();
				    	miobjeto.empezarHilo();
		    		}
			    	
			    	
		    		
		    	}
		    	
		    	((Component) e.getSource()).removeMouseListener(this);
		    	
		    }
		});
		mapaGrafico.setMouseListener(mouseListener);	
		
	}

}
