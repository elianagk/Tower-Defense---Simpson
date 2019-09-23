package GRAFICA;

import Tienda.TiendaGrafica;
import GameObject.GameObject;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.MouseEvent;


public class MapaGrafico extends JLabel{
	private TiendaGrafica tiendaGrafica;
	
	public MapaGrafico(String s, int ancho, int alto) {
		
		this.setBounds(0, 0, ancho, alto);
		ImageIcon fot1= new ImageIcon(getClass().getClassLoader().getResource("plant.jpg"));
		Icon mapa= new ImageIcon(fot1.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
		this.setIcon(mapa);
		this.addMouseListener(new Mouse() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	avisarTienda(e.getX(), e.getY());
		    }
		});
	}
	
	public void agregarEntidad(GameObject o) {
		this.add(o);
	}
	
	public void avisarTienda(int x, int y) {
		
	}
	
	public void removerEntidad(GameObject o) {
		Container parent = o.getGrafico().getParent();
		parent.remove(o.getGrafico());
		parent.validate();
		parent.repaint();
	}
	
}
