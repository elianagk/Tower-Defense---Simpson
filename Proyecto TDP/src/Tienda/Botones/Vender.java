package Tienda.Botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import State.Comprando;
import State.Vendiendo;
import Tienda.TiendaLogica;

public class Vender extends Boton {
	
	
	public Vender(TiendaLogica tiendaLogica, String s) {
		super(tiendaLogica, s);
		this.setEnabled(true);
		
		
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tiendaLogica.getMapaLogico().getJuego().setVender();
				
			}
		});	
	}
	
	
	

}
