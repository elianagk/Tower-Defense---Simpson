
package GameObjectGrafico;

import javax.swing.ImageIcon;

public abstract class PersonajeGrafico extends GameObjectGrafico {
	
	
	public PersonajeGrafico(String s) {
		super(s);
	}

	
	
	public void atacar(String s) {
		imagen=s;
		this.setIcon(new ImageIcon(getClass().getClassLoader().getResource(imagen)));
		repaint();		
	}
	
	
	public void accionar(String s) {
		imagen= s;
		this.setIcon(new ImageIcon(getClass().getClassLoader().getResource(imagen)));
		repaint();
	}
	

	
	public abstract void atacar() ;
	
	public abstract void accionar();

	
}
