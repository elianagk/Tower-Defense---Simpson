package Tienda.Botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GameObject.GameObject;
import Tienda.TiendaLogica;

public class Boton extends JButton {
	
	protected TiendaLogica tienda;
	protected GameObject miobjeto;
	
	public Boton() {
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				//creo el tipo logico
				//le paso a la tienda logica (el tipo logico)
				
			}
			
		});
	}
	
	

}
