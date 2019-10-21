package State;

import java.awt.event.MouseListener;

public abstract class State {
	protected static MouseListener actualMouseListener;
	
	public abstract void actuar();
	
	
	//si se quiere dejar como interfaz, entonces en vez de tener una relacion con el mapaLogico el estado tiene una relacion 
	// con el mapaGrafico, al cual se le agrega un metodo para obtener el mouseListener que tiene agregado en el momento
	// y de esa forma directamente se remueve el mouseListener y se le agrega el nuevo MouseListener al mapa
}
