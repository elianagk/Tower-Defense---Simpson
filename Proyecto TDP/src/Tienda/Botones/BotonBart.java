package Tienda.Botones;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import GameObject.Personajes.Torres.Bart;
import Tienda.TiendaLogica;

public class BotonBart extends Boton {
	
	public BotonBart(String s, TiendaLogica tiendaLogica) {
		super(tiendaLogica);
		this.setText("");
		
		
		this.setIcon(new ImageIcon(s));
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tiendaLogica.setEntidad(new Bart());
			}
		});	
	}

}
