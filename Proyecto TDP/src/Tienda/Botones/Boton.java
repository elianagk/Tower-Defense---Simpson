package Tienda.Botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GameObject.GameObject;
import Tienda.TiendaLogica;

public class Boton extends JButton {
	
	protected TiendaLogica tienda;
	protected GameObject miobjeto;
	
	public Boton(TiendaLogica tienda) {
		this.tienda= tienda; 
	}
	
	

}
