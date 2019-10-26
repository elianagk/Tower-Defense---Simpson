package State;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

import GRAFICA.MapaGrafico;
import GRAFICA.Mouse;
import GameObject.GameObject;
import Juego.Juego;
import Mapa.MapaLogico;

public class AgarrarClick implements State {
	private MapaGrafico mapaGrafico;
	private Juego juego;
	private MapaLogico mapaLogico;
	
	public AgarrarClick(MapaLogico mapa) {
		mapaLogico=mapa;
		mapaGrafico= mapa.getMapaGrafico();
		juego= mapaLogico.getJuego();
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
		    	
		    	ArrayList<GameObject> entidades= mapaLogico.getEntidades();
		    	Iterator<GameObject> it= entidades.iterator();
		    	boolean encontre= false;
		    	
		    	while (it.hasNext() && !encontre) {
		    		GameObject t= it.next();
		    		
		    		if (t.getX()==x && t.getY()==y) {
		    			encontre=true;		
		    			mapaLogico.proximaMagia(t);
		    			mapaGrafico.removerEntidad(mapaLogico.getProximaMagia());
		    		}
		    	}
		    	
		    	
		    	juego.setMagias();
		    	
		    	
		    }
		});
		
	}

}
