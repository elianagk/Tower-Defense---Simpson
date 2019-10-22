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
import Tienda.TiendaLogica;


public class Vendiendo implements State {
	protected MapaLogico mapaLogico;
	protected TiendaLogica tienda;
	protected Juego juego;
	protected MapaGrafico mapaGrafico;
	
	public Vendiendo(Juego j) {
		juego=j;
		mapaGrafico= j.getMapaGrafico();
		mapaLogico=j.getMapaL();
		tienda=mapaLogico.getTiendaLogica();
	}

	@Override
	public void actuar() {
		MouseListener mouseListener;
		mapaGrafico.removeMouseListener(mapaGrafico.getMouseListener());
		mapaGrafico.addMouseListener( mouseListener= new Mouse() {

		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	int x= e.getX();
		    	int y= e.getY();
		    	ArrayList<GameObject> entidades= mapaLogico.getEntidades();
		    	Iterator<GameObject> it= entidades.iterator();
		    	boolean encontre= false;
		    	
		    	while (it.hasNext() && !encontre) {
		    		GameObject t= it.next();
		    		
		    		if (t.getX()==((x/100)*100) && t.getY()==((y/100)*100)) {
		    			encontre=true;		    			
		    			t.Aceptar(tienda.getVisitor());		    			
		    		}
		    	}		    			    
		    }
		});
		
		mapaGrafico.setMouseListener(mouseListener);		
	}

	
}
