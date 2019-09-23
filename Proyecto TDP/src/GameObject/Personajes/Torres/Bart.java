package GameObject.Personajes.Torres;

import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.TorresGrafico.BartGrafico;;

public class Bart extends Torre {
	
	public Bart() {
		miobjetografico = new BartGrafico("C:\\\\Users\\\\Matia\\\\OneDrive\\\\Escritorio\\\\ProyectoGit\\\\proyectoTDP\\\\Proyecto TDP\\\\imagenes\\\\bartsinfondo.png");
	}
	
	
	@Override
	public void atacar() {
		// gif atacando
		
	}
	
}
