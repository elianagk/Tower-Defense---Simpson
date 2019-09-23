package GameObjectGrafico.PersonajesGrafico.TorresGrafico;

import javax.swing.ImageIcon;

import GameObjectGrafico.PersonajesGrafico.TorreGrafico;

public class BartGrafico extends TorreGrafico {
	String direccionImg;
	
	public BartGrafico(String s) {
		direccionImg= s;
		this.setIcon(new ImageIcon("C:\\\\Users\\\\Matia\\\\OneDrive\\\\Escritorio\\\\ProyectoGit\\\\proyectoTDP\\\\Proyecto TDP\\\\imagenes\\\\bartsinfondo.png"));
	}
	
	public void setImagen(String img) {
		imagen = img;
	}
	
	public String getImagen() {
		return direccionImg;
	}
}
