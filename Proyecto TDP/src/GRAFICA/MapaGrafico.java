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
	protected static MouseListener actualMouseListener;
	protected State queHagoConElClick;
	
	public MapaGrafico(TiendaLogica tiendal, String s, int ancho, int alto) {
		tiendaLogica= tiendal;
		this.setBounds(0, 0, ancho, alto);
		this.setLayout(null);
		ImageIcon fot1= new ImageIcon(getClass().getClassLoader().getResource("CASA.png"));
		Icon mapa= new ImageIcon(fot1.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
		this.setIcon(mapa);
		queHagoConElClick= new Jugando(juego);	//se rompe porque el jugando requiere del mapa grafico que se esta inicializando...
		
		//---------------------------------------------
		this.addMouseListener(new Mouse() {
		    @Override
		    public void mouseClicked(MouseEvent e) {//Esto sirve para comprar
		    	queHagoConElClick.actuar();	//el mouse listener deberia funcionar y le tenemos que decir como
//		    	int x= e.getX();
//		    	int y= e.getY();
//		    	if(x<=600 && y>=300 && y<=600)
//		    		avisarTienda((x/100)*100, (y/100)*100);
		    }
		});
		

//		juego = new Juego(this);
//		tiempo = new ContadorTiempo(juego);
//		tiempo.start();
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
		remove(o.getGrafico());
		
		repaint();
	}
	
	public void setJuego(Juego juego) {
		this.juego=juego;
	}
	
	//Sirve para matar a apu desde un boton
	public Juego getJuego() {
		return juego;
	}
	
	public void setMouseListener(MouseListener m) {
		actualMouseListener=m;
	}
	
	public MouseListener getMouseListener() {
		return actualMouseListener;
	}
	
	public void setState(State s) {
		queHagoConElClick= s;
	}
}