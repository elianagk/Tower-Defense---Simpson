package Tienda.Botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GameObject.Personajes.Torres.Lisa;
import Tienda.TiendaLogica;

public class BotonLisa extends Boton {
	
	
	public BotonLisa(TiendaLogica tienda) {
		super(tienda);
		
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tienda.setEntidad(new Lisa());
			}
			
		});	
	}

}