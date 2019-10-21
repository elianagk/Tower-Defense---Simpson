package Tienda;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.event.*;
import Tienda.Botones.BotonComprar;
import Tienda.Botones.Boton;
import Tienda.Botones.BotonAbuelo;
import Tienda.Botones.BotonBart;
import Tienda.Botones.BotonHomero;
import Tienda.Botones.BotonLisa;
import Tienda.Botones.BotonMarge;
import Tienda.Botones.Premio;
import Tienda.Botones.Vender;

public class TiendaGrafica extends JPanel {
	protected Boton[] botones;
	JLabel monedas;
	JLabel dinero;
	protected TiendaLogica tienda;
	
	
	public TiendaGrafica(TiendaLogica tienda) {
	this.setLayout(new GridLayout(1, 9));
	this.setBounds(0, 0, 1100, 100);
	botones = new Boton[7];
	

	
	
	
	//-----
	botones[0]= new BotonHomero("homero.jpg", tienda);
	botones[1]= new BotonBart("bartsinfondo.png", tienda);
	botones[2]= new BotonLisa("lisa.png", tienda);
	botones[3]= new BotonMarge("marge.png", tienda);
	botones[4]= new BotonAbuelo("abe.gif", tienda);
	botones[5]= new Premio("donut.png", tienda); //arreglar
	botones[6]= new Vender(tienda, "vender.jpg");

	for (int i=0; i<botones.length; i++) {
		this.add(botones[i]);
	}
	
	dinero= new JLabel("Puntaje=");
	String p=Integer.toString(tienda.monedas());
	monedas = new JLabel();
	this.add(dinero);
	this.add(monedas);
	
	}
	
	public void actualizarPuntaje(int p) {
		String e= Integer.toString(p);
		monedas.setText(e);
	}
	
	
	

}
