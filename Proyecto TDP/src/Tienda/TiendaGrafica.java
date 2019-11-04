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
	JLabel puntaje;
	JLabel dinero;
	protected TiendaLogica tienda;
	
	
	public TiendaGrafica(TiendaLogica tienda) {
	this.setLayout(new GridLayout(1, 9));
	this.setBounds(0, 0, 1100, 90);
	this.setOpaque(false);
	botones = new Boton[7];
	this.tienda=tienda;
	

	
	
	
	//-----
	botones[0]= new BotonHomero("homero.png", tienda);
	botones[1]= new BotonBart("bart.png", tienda);
	botones[2]= new BotonLisa("lisa.png", tienda);
	botones[3]= new BotonMarge("marge.png", tienda);
	botones[4]= new BotonAbuelo("abe.png", tienda);
	botones[5]= new Premio("donut.png", tienda); //arreglar
	botones[6]= new Vender(tienda, "vender.png");

	for (int i=0; i<botones.length; i++) {
		this.add(botones[i]);
	}
	
	
	puntaje= new JLabel("Puntaje = " );
	puntaje.setBackground(Color.white);
	puntaje.setOpaque(true);
	this.add(puntaje);
	dinero= new JLabel("Plata =");
	dinero.setBackground(Color.white);
	dinero.setOpaque(true);
	this.add(dinero);
	
	
	
	}
	
	
	
	public void actualizarPlata(int p) {
		String s= String.valueOf(p);
		dinero.setText("Plata= "+s);
		tienda.getMapaLogico().getMapaGrafico().repaint();
		
	}
	
	public void actualizarPuntaje(int p) {
		String s= String.valueOf(p);
		puntaje.setText("Puntaje= "+ s);
		tienda.getMapaLogico().getMapaGrafico().repaint();
	}
	
	
	
	
	

}
