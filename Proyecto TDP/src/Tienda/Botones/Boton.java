package Tienda.Botones;



import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;

import GameObject.GameObject;
import GameObject.Personajes.Torre;
import GameObject.Personajes.Torres.Bart;
import Tienda.TiendaLogica;

public class Boton extends JButton {
	
	protected TiendaLogica tiendaLogica;
	
	public Boton(String s, TiendaLogica tiendaLogica, GameObject t) {
		this.tiendaLogica= tiendaLogica;
		this.setText("");
		this.setSize(100, 100);
		this.setBorder(new RoundedBorder(50));
		this.setContentAreaFilled(false);
		
		ImageIcon fot= new ImageIcon(getClass().getClassLoader().getResource(s));
		Icon i= new ImageIcon(fot.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
		this.setIcon(i);
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//HAY QUE PREGUNTAR SI LE ALCANZA LA PLATA AL JUGADOR PARA PODER PONER ESTO
				tiendaLogica.setEntidad(t.clone());
			}
		});	
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
