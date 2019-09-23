package Tienda.Botones;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import GameObject.Personajes.Torres.Homero;
import Tienda.TiendaLogica;

public class BotonHomero extends Boton {
	
	
	public BotonHomero(String s, TiendaLogica tienda) {
		super(tienda);
		this.setText("");
		ImageIcon fot0= new ImageIcon(getClass().getClassLoader().getResource(s));
		Icon homero= new ImageIcon(fot0.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
		this.setIcon(homero);
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tienda.setEntidad(new Homero());
			}
			
		});	
	}

}
