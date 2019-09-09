package GRAFICA;

import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class probando extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	
	private JLabel dibujo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					probando frame = new probando();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public probando() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				mover(arg0);
			}
		});
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.agregarDibujo();
	}
	
	protected void mover(KeyEvent key){
		System.out.println(key.getKeyCode());
		
		Rectangle pos = dibujo.getBounds();
		
		int newX = (int) pos.getX() + 10;
		int newY = (int) pos.getY();
		int ancho = (int) pos.getWidth();
		int alto = (int) pos.getHeight();
		
		dibujo.setBounds(newX, newY, ancho, alto);
	}
	
	private void agregarDibujo(){
		ImageIcon imagen = new ImageIcon("C:/Users/eliko/OneDrive/Documents/PROYECTO TDP/up.png");
		dibujo = new JLabel(imagen);
		
		dibujo.setBounds(0, 0, 25, 25);
		
		this.add(dibujo);
	}
}