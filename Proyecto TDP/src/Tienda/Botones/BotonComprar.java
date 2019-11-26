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
import State.StateJuego.Comprando;
import Tienda.TiendaLogica;

public class BotonComprar extends Boton {
	
	
	
	public BotonComprar(String s, TiendaLogica tiendaLogica, GameObject t) {
		super(tiendaLogica, s);
		
		
		
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tiendaLogica.getJuego().cambiarEstado(new Comprando(tiendaLogica.getJuego()));
				tiendaLogica.setEntidad(t.clone());
			}
		});	
	}
	
	
	
	
	

}
