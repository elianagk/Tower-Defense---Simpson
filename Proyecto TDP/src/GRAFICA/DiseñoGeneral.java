package GRAFICA;

import java.awt.*;
import javax.swing.*;
import Juego.Juego;
import Jugador.Jugador;
import Mapa.MapaLogico;
import State.StateJuego.State;
import State.StateJuego.Vendiendo;
import Tienda.TiendaGrafica;
import Tienda.TiendaLogica;
import Tienda.Botones.BotonComprar;


public class DiseņoGeneral extends JFrame{
	

	/**
	 * 
	 */
	private JFrame frmJuego;
	private MapaGrafico MAPA;
	private BotonComprar btnHomero;
	private JLayeredPane PANELPRINCIPAL;
	private TiendaGrafica PANELTIENDA;
	private Juego juego;
	private ContadorTiempo tiempo;
	private TiendaLogica tiendaLogica;
	private MapaLogico mapal;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiseņoGeneral window = new DiseņoGeneral();
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
	public DiseņoGeneral() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJuego = new JFrame();
		frmJuego.setTitle("Juego");
		frmJuego.setResizable(false);
		frmJuego.setBounds(200, 100, 1080, 800);
		frmJuego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJuego.getContentPane().setLayout(null);
		
		PANELPRINCIPAL = new JLayeredPane();
		PANELPRINCIPAL.setBounds(0, 0, frmJuego.getWidth(), frmJuego.getHeight());
		frmJuego.getContentPane().add(PANELPRINCIPAL);
		frmJuego.setVisible(true);
		PANELPRINCIPAL.setLayout(null);
		
		MAPA = new MapaGrafico(tiendaLogica, "casa.png", frmJuego.getWidth(), frmJuego.getHeight());
		mapal= new MapaLogico(PANELPRINCIPAL.getWidth(), PANELPRINCIPAL.getHeight(),MAPA);
		tiendaLogica= new TiendaLogica(mapal);
		
		 
		
		mapal.setTiendaLogica(tiendaLogica);
		MAPA.setTiendaLogica(tiendaLogica);
		
		
		juego = new Juego(MAPA, mapal);
		mapal.setJuego(juego);
		
		
		PANELTIENDA= new TiendaGrafica(tiendaLogica);
		PANELPRINCIPAL.add(PANELTIENDA);
		PANELPRINCIPAL.setLayer(PANELTIENDA, 0);
		
		tiendaLogica.setTiendaGrafica(PANELTIENDA);
		tiendaLogica.setJugador();
		
		PANELPRINCIPAL.add(MAPA); 
		PANELPRINCIPAL.setLayer(MAPA, 0);

		
		
		
		
		
		//-----------AJUSTAR UNA IMAGEN A CUALQUIER OBJETO-----------------
		//ImageIcon fot = new ImageIcon(path_ala_imagen);
		//Icon icono = new ImageIcon(fot.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
		//jLabel1.setIcon(icono);
		
		
		tiempo = new ContadorTiempo(juego);
		tiempo.start();
		
		MAPA.setJuego(juego);
		
		
	}
	
	
}