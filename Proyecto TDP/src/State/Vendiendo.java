package State;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

import GRAFICA.Mouse;
import GameObject.GameObject;
import Mapa.MapaLogico;
import Tienda.TiendaLogica;

public class Vendiendo extends State {
	protected MapaLogico mapa;
	protected TiendaLogica tienda;
	
	
	
	public Vendiendo(MapaLogico mapa) {
		this.mapa= mapa;
		tienda= mapa.getTiendaLogica();
	}

	@Override
	public void actuar() {
		mapa.getMapaGrafico().removeMouseListener(actualMouseListener);
		mapa.getMapaGrafico().addMouseListener(actualMouseListener= new Mouse() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	int x= e.getX();
		    	int y= e.getY();
		    	ArrayList<GameObject> entidades= mapa.getEntidades();
		    	Iterator<GameObject> it= entidades.iterator();
		    	boolean encontre= false;
		    	
		    	while (it.hasNext() && !encontre) {
		    		GameObject t= it.next();
		    		if (t.getX()==x && t.getY()==y) {
		    			encontre=true;
		    			t.Aceptar(tienda.getVisitor());
		    			
		    		}
		    	}
		    	
		    }
		});
		
		mapa.setEstado(new Jugando(mapa));
		
	}

	
}
