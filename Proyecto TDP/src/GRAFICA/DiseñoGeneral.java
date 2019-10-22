package GRAFICA;

import java.awt.*;
import javax.swing.*;
import Juego.Juego;
import Mapa.MapaLogico;
import Tienda.TiendaGrafica;
import Tienda.TiendaLogica;
import Tienda.Botones.BotonComprar;
import State.State;
import State.Vendiendo;


public class DiseñoGeneral extends JFrame{
	

	/**
	 * 
	 */
	private JFrame frmJuego;
	private MapaGrafico MAPA;
	private BotonComprar btnHomero;
	private JLayeredPane PANELPRINCIPAL;
	private TiendaGrafica PANELTIENDA;
	int index=0;
	private Juego juego;
	private ContadorTiempo tiempo;
	private TiendaLogica tiendaLogica;
	private MapaLogico mapal;
	
	private State vendiendo;
	private State comprando;
	private State jugando;
	

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
		frmJuego.setResizable(false);
		frmJuego.setBounds(100, 100, 1080, 800);
		frmJuego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJuego.getContentPane().setLayout(null);
		
		PANELPRINCIPAL = new JLayeredPane();
		PANELPRINCIPAL.setBounds(0, 0, frmJuego.getWidth(), frmJuego.getHeight());
		frmJuego.getContentPane().add(PANELPRINCIPAL);
		frmJuego.setVisible(true);
		PANELPRINCIPAL.setLayout(null);
		
		mapal= new MapaLogico(PANELPRINCIPAL.getWidth(), PANELPRINCIPAL.getHeight()); 
		tiendaLogica= new TiendaLogica(mapal);
		MAPA = new MapaGrafico(tiendaLogica, "casa.png", PANELPRINCIPAL.getWidth(), PANELPRINCIPAL.getHeight());
		mapal.setMapaGrafico(MAPA);
		mapal.setTiendaLogica(tiendaLogica);
		
		juego = new Juego(MAPA, mapal);
		tiendaLogica.setJugador(juego.getJugador());
		
		PANELTIENDA= new TiendaGrafica(tiendaLogica);
		PANELPRINCIPAL.add(PANELTIENDA);
		PANELPRINCIPAL.setLayer(PANELTIENDA, 0);
		
		
		PANELPRINCIPAL.add(MAPA);
		PANELPRINCIPAL.setLayer(MAPA, 0);

		
		
		
		
		
		//-----------AJUSTAR UNA IMAGEN A CUALQUIER OBJETO-----------------
		//ImageIcon fot = new ImageIcon(path_ala_imagen);
		//Icon icono = new ImageIcon(fot.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
		//jLabel1.setIcon(icono);
		
		
		tiempo = new ContadorTiempo(juego);
		tiempo.start();
		
		MAPA.setJuego(juego);
		
		index++;
	}
	
	
	
	//-------------METODOS----------------------
//	
//	public void agregarHomero(int x, int y) {
//		JLabel h= new JLabel();
//		h.setBounds(x, y, 30, 30);
//		ImageIcon fot0= new ImageIcon(getClass().getClassLoader().getResource("bartsinfondo.png"));
//		Icon homero= new ImageIcon(fot0.getImage().getScaledInstance(h.getWidth(), h.getHeight(), Image.SCALE_DEFAULT));
//		h.setIcon(homero);
//		PANELPRINCIPAL.add(h);
//		PANELPRINCIPAL.setLayer(h,  1);
//		btnHomero.setEnabled(true);
//	}
//	
	
}