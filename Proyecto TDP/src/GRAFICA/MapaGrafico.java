package GRAFICA;

import Tienda.TiendaGrafica;
import Tienda.TiendaLogica;
import GameObject.GameObject;
import Juego.Juego;
import State.Jugando;
import State.State;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MapaGrafico extends JLabel{
	
	private TiendaLogica tiendaLogica;
	private Juego juego;
	private ContadorTiempo tiempo;
	protected MouseListener actualMouseListener;
	protected State queHagoConElClick;
	
	
	
	public MapaGrafico(TiendaLogica tiendal, String s, int ancho, int alto) {
		tiendaLogica= tiendal;
		this.setBounds(0, 0, ancho, alto);
		this.setLayout(null);
		ImageIcon fot1= new ImageIcon(getClass().getClassLoader().getResource("CASA2.png"));
		Icon mapa= new ImageIcon(fot1.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
		this.setIcon(mapa);

		
		
		
		//---------------------------------------------


	}
	
	public void setTiendaLogica(TiendaLogica tienda) {
		tiendaLogica=tienda;
	}
	
	public void agregarEntidad(GameObject o) {
		JLabel toAdd= o.getGrafico();
		toAdd.setBounds(o.getX(), o.getY(), 100, 100);
		this.add(toAdd);	
		this.repaint();
	}
	
	public void avisarTienda(int x, int y) {
		tiendaLogica.revisarTienda(x, y);
	}
	
	public void removerEntidad(GameObject o) {
		this.remove(o.getGrafico());
		repaint();
	}
	
	public void setJuego(Juego juego) {
		this.juego=juego;
	}
	
	public Juego getJuego() {
		return juego;
	}
	
	public TiendaLogica getTiendaLogica() {
		return tiendaLogica;
	}
	
	public void setMouseListener(MouseListener m) {
		actualMouseListener=m;
	}
	
	public MouseListener getMouseListener() {
		return actualMouseListener;
	}
	
	public void gameOver() {
		juego.gameOver();
		ImageIcon fot1= new ImageIcon(getClass().getClassLoader().getResource("gameover.gif"));
		Icon mapa= new ImageIcon(fot1.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
		this.setIcon(mapa);
		repaint();
	}
	
	public void victory() {
		ImageIcon fot1= new ImageIcon(getClass().getClassLoader().getResource("victory.gif"));
		Icon mapa= new ImageIcon(fot1.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
		this.setIcon(mapa);
		repaint();
	}
}