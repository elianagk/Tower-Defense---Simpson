package Tienda;

import javax.swing.JPanel;

import Tienda.Botones.Boton;
import Tienda.Botones.BotonAbuelo;
import Tienda.Botones.BotonBart;
import Tienda.Botones.BotonHomero;
import Tienda.Botones.BotonLisa;
import Tienda.Botones.BotonMarge;
import Tienda.Botones.Premio;

public class TiendaGrafica extends JPanel {
	protected Boton[] botones;
	
	
	public TiendaGrafica() {
	
	botones = new Boton[6];
	botones[1]= new BotonAbuelo();
	botones[2]= new BotonBart();
	botones[3]= new BotonHomero();
	botones[4]= new BotonLisa();
	botones[5]= new BotonMarge();
	botones[6]= new Premio();
	for (int i=1; i<botones.length; i++) {
		this.add(botones[i]);
	}
	
	
	
	}
	
	

}
