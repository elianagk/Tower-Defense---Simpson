package Tienda;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.event.*;
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
	this.setLayout(new GridLayout(1, 7));
	this.setBounds(0, 0, 600, 100);
	botones = new Boton[6];
	JButton botonEliminar= new JButton(new ImageIcon(getClass().getClassLoader().getResource("apu1.png")));
	botonEliminar.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	});
	//-----
	
	//-----´
	botones[0]= new BotonHomero("homero.ico", tienda);
	
	botones[1]= new BotonBart("bartsinfondo.png", tienda);
	
	botones[2]= new BotonLisa("lisa.png", tienda);
	botones[3]= new BotonMarge("marge.png", tienda);
	botones[4]= new BotonAbuelo("abe.gif", tienda);
	botones[5]= new Premio("donut.png", tienda);
	
	
	for (int i=0; i<botones.length; i++) {
		this.add(botones[i]);
	}
	
	
	
	}
	
	

}
