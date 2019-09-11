package GRAFICA;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class holi extends JFrame{

	private JFrame frame;
	private JPanel panel;
	private JLabel map;
	private JLabel bart;
	private JPanel panelbotones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					holi window = new holi();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public holi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 961, 702);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

		
		panel = new JPanel();
		frame.getContentPane().add(panel);
		ImageIcon mapa= new ImageIcon ("C:/Users/eliko/OneDrive/Documents/PROYECTO TDP/plant.jpg");
		panel.setBounds(15, 15, 200, 200);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Puntaje: ");
		lblNewLabel.setBounds(455, 0, 98, 48);
		panel.add(lblNewLabel);
		
		JButton Lisa = new JButton("LISA");
		Lisa.setBounds(333, 0, 112, 82);
		panel.add(Lisa);
		
		JButton Homero = new JButton("HOMERO");
		Homero.setIcon(new ImageIcon("C:\\Users\\eliko\\OneDrive\\Documents\\PROYECTO TDP\\homer.png"));
		Homero.setBounds(222, 0, 112, 82);
		panel.add(Homero);
		
		JButton Marge = new JButton("MARGE");
		Marge.setBounds(109, 0, 112, 82);
		Marge.setIcon(new ImageIcon("C:\\Users\\eliko\\OneDrive\\Documents\\PROYECTO TDP\\margesinfondo.png"));
		panel.add(Marge);
		
		bart= new JLabel();
		
		JButton Bart = new JButton("BART");
		Bart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bart= new JLabel();
				bart.setBounds(388, 465, 82, 90);
				bart.setBackground(null);

				bart.setIcon(new ImageIcon("C:/Users/eliko/OneDrive/Documents/PROYECTO TDP/bartsinfondo.png"));
				panel.add(bart);
				
			}
		});
		
		Bart.setBounds(0, 0, 112, 82);
		panel.add(Bart);
		
//		bart= new JLabel();
//		bart.setBounds(388, 465, 82, 90);
//		bart.setBackground(null);
////		Point p=bart.getLocation();
////		int x= p.x;
////		int y= p.y;
//		bart.setIcon(new ImageIcon("C:/Users/eliko/OneDrive/Documents/PROYECTO TDP/bartsinfondo.png"));
//		
//		panel.add(bart);
		
		
		map= new JLabel();
		map.setBounds(0, -53, 1436, 874);
		
		map.setIcon(mapa);
		panel.add(map);
		
		
		
		
		
		
		
		
		/**
		 * oyente boton mouseListener(x,y) bart 
		 *  Aliado b = new Bart(x,y)
		 *  panel.add(b.getGrafico().getSprite();
		 *  miMapa.addAliado(b,(x,y))
		 */
		
		
		
		
		
		
		
//	panelbotones = new JPanel();
//	panelbotones.setSize(20,200);
//	frame.getContentPane().add(panelbotones);
//	
	
	
	
	//panelbotones.add(label);
//		panel.add(panelbotones);
//		panelbotones.setLayout(new GridLayout(5,1));
//		panelbotones.setSize(20, 20);
		
	
		
		
		
//		marge = new JButton();		
//		
//	
//		marge.setHorizontalAlignment(SwingConstants.RIGHT);
//		marge.setVerticalAlignment(SwingConstants.TOP);		
//		
//		marge.setIcon(new ImageIcon("C:/Users/eliko/OneDrive/Documents/PROYECTO TDP/marge.png") );
//		panelbotones.add(marge);
//		

//		
//		
//		JButton homero= new JButton();
//	
//		homero.setIcon(new ImageIcon ("C:/Users/eliko/OneDrive/Documents/PROYECTO TDP/homer.png"));
//		
//		
//		panelbotones.add(homero);
		
//		JButton homero = new JButton();
//		homero.setVerticalAlignment(SwingConstants.TOP);
//
//		
//		homero.setBounds(0, 0, 5, 5);
//		homero.setIcon(new ImageIcon("C:/Users/eliko/OneDrive/Documents/PROYECTO TDP/homer.png") );
//		panelbotones.add(homero);
		
		
	}
}
