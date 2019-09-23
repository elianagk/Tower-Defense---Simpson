package Tienda.Botones;



import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import GameObject.GameObject;
import GameObject.Personajes.Torre;
import GameObject.Personajes.Torres.Bart;
import Tienda.TiendaLogica;

public class Boton extends JButton {
	
	protected TiendaLogica tienda;
	protected GameObject miobjeto;
	
	public Boton(String s, TiendaLogica tienda, GameObject t) {
		this.tienda= tienda; 
		miobjeto= t;
		this.setText("");
		
		
		this.setIcon(new ImageIcon(getClass().getClassLoader().getResource(s)));
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tienda.setEntidad(miobjeto);
			}
		});	
	}
	
	

}
