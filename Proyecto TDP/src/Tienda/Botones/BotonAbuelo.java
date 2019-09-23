package Tienda.Botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GameObject.Personajes.Torres.Abuelo;
import Tienda.TiendaLogica;

public class BotonAbuelo extends Boton {
	
	public BotonAbuelo(TiendaLogica tienda) {
		super(tienda);
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				tienda.setEntidad(new Abuelo());
			}
			
		});
	}

}
