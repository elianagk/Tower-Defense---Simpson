package GRAFICA;

import Tienda.TiendaGrafica;
import Tienda.TiendaLogica;
import GameObject.GameObject;
import Juego.Juego;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.MouseEvent;


public class MapaGrafico extends JLabel{
	
	private TiendaLogica tiendaLogica;
	private Juego juego;
	private ContadorTiempo tiempo;
	
	public MapaGrafico(TiendaLogica tiendal, String s, int ancho, int alto) {
		tiendaLogica= tiendal;
		this.setBounds(0, 0, ancho, alto);
		this.setLayout(null);
		ImageIcon fot1= new ImageIcon(getClass().getClassLoader().getResource("CASA.png"));
		Icon mapa= new ImageIcon(fot1.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
		this.setIcon(mapa);
		this.addMouseListener(new Mouse() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    	avisarTienda(e.getX(), e.getY());
		    }
		});
		

//		juego = new Juego(this);
//		tiempo = new ContadorTiempo(juego);
//		tiempo.start();
	}
	
	public void agregarEntidad(GameObject o) {
		JLabel toAdd= o.getGrafico();
		toAdd.setBounds(o.getX(), o.getY(), 100, 100);
		System.out.println("Coordenada x: "+o.getX()+" // Coordenada y: "+o.getY());
		this.add(toAdd);	//lo detecta pero mepa que lo añade y no se ve
		this.repaint();
	}
	
	public void avisarTienda(int x, int y) {
		tiendaLogica.revisarTienda(x, y);
	}
	
	public void removerEntidad(GameObject o) {
		Container parent = o.getGrafico().getParent();
		parent.remove(o.getGrafico());
		parent.validate();
		parent.repaint();
	}
	
	
	
	//Sirve para matar a apu desde un boton
	public Juego getJuego() {
		return juego;
	}
}