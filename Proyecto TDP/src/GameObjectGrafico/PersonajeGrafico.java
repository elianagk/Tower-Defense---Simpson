
package GameObjectGrafico;

import javax.swing.ImageIcon;

public class PersonajeGrafico extends GameObjectGrafico {
	
	
	public PersonajeGrafico(String s) {
		super(s);
	}

	@Override
	public void cambiarPosicion() {
		// TODO Auto-generated method stub
		
	}
	
	public void atacar(String s) {
		this.setImagen(s);
		this.setIcon(new ImageIcon(getClass().getClassLoader().getResource(imagen)));
	}

	
}
