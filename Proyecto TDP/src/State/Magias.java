package State;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;

import GRAFICA.MapaGrafico;
import GRAFICA.Mouse;
import GameObject.GameObject;
import GameObject.Objetos.HiloAnimacionMagias;
import Juego.Juego;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public class Magias implements State{
	protected MapaGrafico mapaGrafico;
	protected MapaLogico mapaLogico;
	protected Juego juego;
	protected Visitor visitor;
	
	
	
	public Magias(Juego j) {
		juego=j;
		mapaGrafico= juego.getMapaGrafico();
		mapaLogico= juego.getMapaL();
		
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
//visitor para buscar el aliado, aplicar magia al aliado
		    	ArrayList<GameObject> entidades= mapaLogico.getEntidades();
		    	Iterator<GameObject> it= entidades.iterator();
		    	boolean encontre= false;
		    	
		    	while (it.hasNext() && !encontre) {
		    		GameObject t= it.next();
		    		
		    		if (t.getX()==((x/100)*100) && t.getY()==((y/100)*100)) {
		    			encontre=true;		    			
		    			t.Aceptar(mapaLogico.getProximaMagia().getVisitor());	
		    			
		    		}
		    	}
		    	
		    	juego.setJugar();
		    	
		    }
		});
		mapaGrafico.setMouseListener(mouseListener);	
		
	}
	
	
	
	

}
