package GRAFICA;

import Tienda.TiendaGrafica;
import GameObject.GameObject;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MapaGrafico {
	private TiendaGrafica tiendaGrafica;
	
	
	
	public void agregarEntidad(GameObject o) {
		
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
