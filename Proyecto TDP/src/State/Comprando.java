package State;

import java.awt.event.MouseEvent;

import GRAFICA.Mouse;
import Mapa.MapaLogico;

public class Comprando extends State {
	
	protected MapaLogico mapa;
	
	public Comprando(MapaLogico mapa) {
		this.mapa= mapa;
	}

	@Override
	public void actuar() {
		mapa.getMapaGrafico().removeMouseListener(actualMouseListener);
		mapa.getMapaGrafico().addMouseListener(actualMouseListener= new Mouse() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	int x= e.getX();
		    	int y= e.getY();
		    	if( y>=300 && y<=700)
		    		mapa.getMapaGrafico().avisarTienda((x/100)*100, (y/100)*100);
		    }
		});
		
		mapa.setEstado(new Jugando(mapa));
		
	}

	

}
