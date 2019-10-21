package State;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

import GRAFICA.MapaGrafico;
import GRAFICA.Mouse;
import GameObject.GameObject;
import Juego.Juego;
import Mapa.MapaLogico;
import Tienda.TiendaLogica;


public class Vendiendo implements State {
	protected MapaLogico mapaL;
	protected TiendaLogica tienda;
	protected Juego juego;
	protected MapaGrafico mapaG;
	
	public Vendiendo(Juego j) {
		juego=j;
		mapaG= j.getMapag();
		mapaL=j.getMapaL();
		tienda=mapaL.getTiendaLogica();
	}

	@Override
	public void actuar() {

		mapaG.removeMouseListener(mapaG.getMouseListener());
		mapaG.addMouseListener( new Mouse() {

		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	int x= e.getX();
		    	int y= e.getY();
		    	ArrayList<GameObject> entidades= mapaL.getEntidades();
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
		
		juego.setJugar();
		
	}

	
}
