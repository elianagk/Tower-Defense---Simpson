package GRAFICA;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;


public class holi {

	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JButton marge;
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
		
		
		
		label= new JLabel();
		panel = new JPanel(new FlowLayout());
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		ImageIcon icon= new ImageIcon ("C:/Users/eliko/OneDrive/Documents/PROYECTO TDP/pvsz.png");
		panel.setBounds(15, 15, 200, 200);
		
		panelbotones = new JPanel();
		panel.add(panelbotones);
		panelbotones.setLayout(new GridLayout(1,5));
		panelbotones.setSize(20, 200);
		
	
		
		
		
		marge = new JButton();		
		marge.setSize(1,1);
		marge.setLayout(new GridLayout(1,1));
		marge.setHorizontalAlignment(SwingConstants.RIGHT);
		marge.setVerticalAlignment(SwingConstants.TOP);		
		marge.setLocation(1, 1);
		marge.setIcon(new ImageIcon("C:/Users/eliko/OneDrive/Documents/PROYECTO TDP/marge.png") );
		panelbotones.add(marge);
		
		label.setIcon(icon);
		
		panel.add(label);
		
		
		JButton homero= new JButton();
		homero.setSize(5, 5);
		homero.setIcon(new ImageIcon ("C:/Users/eliko/OneDrive/Documents/PROYECTO TDP/homer.png"));
		homero.setLayout(new GridLayout(1,2));
		
		panelbotones.add(homero);
		
//		JButton homero = new JButton();
//		homero.setVerticalAlignment(SwingConstants.TOP);
//
//		
//		homero.setBounds(0, 0, 5, 5);
//		homero.setIcon(new ImageIcon("C:/Users/eliko/OneDrive/Documents/PROYECTO TDP/homer.png") );
//		panelbotones.add(homero);
		
		
	}

}
