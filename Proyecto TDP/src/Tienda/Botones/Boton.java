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
	
	public Boton(String s, TiendaLogica tienda, GameObject t) {
		this.tienda= tienda;
		this.setText("");
		this.setSize(100, 100);
		ImageIcon fot= new ImageIcon(getClass().getClassLoader().getResource(s));
		Icon i= new ImageIcon(fot.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
		this.setIcon(i);
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//HAY QUE PREGUNTAR SI LE ALCANZA LA PLATA AL JUGADOR PARA PODER PONER ESTO
				tienda.setEntidad(t.clone());
			}
		});	
	}
	
	

}
