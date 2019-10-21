package Tienda.Botones;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;

import Tienda.TiendaLogica;
import State.State;

public class Boton extends JButton {
	
	protected TiendaLogica tiendaLogica;
	protected State estado;
	
	public Boton(TiendaLogica tienda, String s, State es) {
		tiendaLogica= tienda;
		estado= es;
		
		this.setSize(100, 100);
		this.setBorder(new RoundedBorder(50));
		this.setContentAreaFilled(false);
		
		ImageIcon fot= new ImageIcon(getClass().getClassLoader().getResource(s));
		Icon i= new ImageIcon(fot.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
		this.setIcon(i);
	}
	
	
	
	
	
	
	
	
	private static class RoundedBorder implements Border {

	    private int radius;


	    RoundedBorder(int radius) {
	        this.radius = radius;
	    }


	    public Insets getBorderInsets(Component c) {
	        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
	    }


	    public boolean isBorderOpaque() {
	        return true;
	    }


	    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
	        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
	    }
	}
	
	
	

}
