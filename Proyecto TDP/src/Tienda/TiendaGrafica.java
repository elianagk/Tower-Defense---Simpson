package Tienda;

import java.awt.GridLayout;

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
	protected TiendaLogica tienda;
	
	public TiendaGrafica(TiendaLogica tienda) {
	this.setLayout(new GridLayout(1, 6));
	this.setBounds(0, 0, 600, 100);
	botones = new Boton[6];
	
	//-----
	
	//-----
	botones[1]= new BotonBart("C:\\Users\\Matia\\OneDrive\\Escritorio\\ProyectoGit\\proyectoTDP\\Proyecto TDP\\imagenes\\bartsinfondo.png", tienda);
	this.add(botones[1]);
	
	
//	for (int i=0; i<botones.length; i++) {
//		this.add(botones[i]);
//	}
	
	
	
	}
	
	

}
