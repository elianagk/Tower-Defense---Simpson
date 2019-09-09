package GRAFICA;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
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
		frame.setBounds(100, 100, 1500, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

		
		panel = new JPanel(new FlowLayout());
		frame.getContentPane().add(panel);
		ImageIcon mapa= new ImageIcon ("C:/Users/eliko/OneDrive/Documents/PROYECTO TDP/plant.jpg");
		panel.setBounds(15, 15, 200, 200);
		
		
		map= new JLabel();
		
		map.setIcon(mapa);
		panel.add(map);
		
		bart= new JLabel();
		bart.setBackground(null);
		
		bart.setIcon(new ImageIcon("C:/Users/eliko/OneDrive/Documents/PROYECTO TDP/bartsinfondo.png"));
		
		panel.add(bart);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
