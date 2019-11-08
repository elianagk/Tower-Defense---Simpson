package GameObjectGrafico;

import java.awt.*;
import javax.swing.*;


public abstract class GameObjectGrafico extends JLabel {
	protected String imagen;
	protected String imagenatacando;
	
	
	
	public GameObjectGrafico(String s) {
		imagen= s;
		this.setSize(100, 100);
		ImageIcon fot= new ImageIcon(getClass().getClassLoader().getResource(s));
		Icon i= new ImageIcon(fot.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
		this.setIcon(i);
		
		
	}
	
	public abstract void accionar();
	public abstract void atacar();
	
	
	
	public void setImagen(String img) {
		imagen = img;
	}
	
	public void setImagenAtacando(String s) {
		imagenatacando=s;
	}
	
	
	
	
	
	
	
	
	
}
