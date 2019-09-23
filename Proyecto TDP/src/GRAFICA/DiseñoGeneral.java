package GRAFICA;

import java.awt.*;
import javax.swing.*;

import Juego.Juego;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;


public class DiseñoGeneral extends JFrame{
	

	/**
	 * 
	 */
	private JFrame frmJuego;
	private JLabel MAPA;
	private JButton btnHomero;
	private JLayeredPane PANELPRINCIPAL;
	private JPanel PANELTIENDA;
	int index=0;
	private Juego juego;
	private ContadorTiempo tiempo;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiseñoGeneral window = new DiseñoGeneral();
					window.frmJuego.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DiseñoGeneral() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJuego = new JFrame();
		frmJuego.setTitle("Juego");
		//frmJuego.setResizable(false);
		frmJuego.setBounds(100, 100, 1080, 720);
		frmJuego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJuego.getContentPane().setLayout(null);
		
		PANELPRINCIPAL = new JLayeredPane();
		PANELPRINCIPAL.setBounds(0, 0, frmJuego.getWidth(), frmJuego.getHeight());
		frmJuego.getContentPane().add(PANELPRINCIPAL);
		frmJuego.setVisible(true);
		PANELPRINCIPAL.setLayout(null);
		
		JLayeredPane PANELTIENDA = new JLayeredPane();
		PANELTIENDA.setBounds(0, 0, 500, 100);
		PANELPRINCIPAL.add(PANELTIENDA);
		PANELPRINCIPAL.setLayer(PANELTIENDA, 0);
		PANELTIENDA.setLayout(null);
		
		
		
		
		MAPA = new JLabel("");
		MAPA.setBounds(0, 0, PANELPRINCIPAL.getWidth(), PANELPRINCIPAL.getHeight());
		PANELPRINCIPAL.add(MAPA);
		PANELPRINCIPAL.setLayer(MAPA, 0);
		ImageIcon fot1= new ImageIcon(getClass().getClassLoader().getResource("CASA.png"));
		Icon mapa= new ImageIcon(fot1.getImage().getScaledInstance(MAPA.getWidth(), MAPA.getHeight(), Image.SCALE_DEFAULT));
		MAPA.setIcon(mapa);
		MAPA.addMouseListener( new Mouse());
		
		btnHomero = new JButton("");
		btnHomero.setBounds(0, 0, 100, 100);
		PANELTIENDA.add(btnHomero);
		PANELTIENDA.setLayer(btnHomero, 0);
		btnHomero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnHomero.setEnabled(false);
				MAPA.addMouseListener(new Mouse() {
				    @Override
				    public void mouseClicked(MouseEvent e) {
				    	agregarHomero(e.getX(), e.getY());
				    }
				});
			}
		});
		ImageIcon fot0= new ImageIcon(getClass().getClassLoader().getResource("bartsinfondo.png"));
		Icon homero= new ImageIcon(fot0.getImage().getScaledInstance(btnHomero.getWidth(), btnHomero.getHeight(), Image.SCALE_DEFAULT));
		btnHomero.setIcon(homero);
		
		
		
		
		//-----------AJUSTAR UNA IMAGEN A CUALQUIER OBJETO-----------------
		//ImageIcon fot = new ImageIcon(path_ala_imagen);
		//Icon icono = new ImageIcon(fot.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
		//jLabel1.setIcon(icono);
		
		juego = new Juego(this);
		tiempo = new ContadorTiempo(juego);
		tiempo.start();
		
		index++;
	}
	
	
	
	//-------------METODOS----------------------
	
	public void agregarHomero(int x, int y) {
		JLabel h= new JLabel();
		h.setBounds(x, y, 30, 30);
		ImageIcon fot0= new ImageIcon(getClass().getClassLoader().getResource("bartsinfondo.png"));
		Icon homero= new ImageIcon(fot0.getImage().getScaledInstance(h.getWidth(), h.getHeight(), Image.SCALE_DEFAULT));
		h.setIcon(homero);
		PANELPRINCIPAL.add(h);
		PANELPRINCIPAL.setLayer(h,  1);
		btnHomero.setEnabled(true);
	}
	
	
}