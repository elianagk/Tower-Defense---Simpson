package Tienda.Botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import State.StateJuego.Comprando;
import State.StateJuego.Vendiendo;
import Tienda.TiendaLogica;

public class Vender extends Boton {
	
	
	public Vender(TiendaLogica tiendaLogica, String s) {
		super(tiendaLogica, s);
		this.setEnabled(true);
		
		
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tiendaLogica.getJuego().cambiarEstado(new Vendiendo(tiendaLogica.getJuego()));
				
			}
		});	
	}
	
	
	

}
