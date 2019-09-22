package Tienda.Botones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GameObject.Personajes.Torres.Abuelo;

public class BotonAbuelo extends Boton {
	
	public BotonAbuelo() {
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				miobjeto= new Abuelo();
				tienda.setEntidad(miobjeto);
			}
			
		});
	}

}
