package GameObject.Personajes.Enemigos;

import javax.swing.JLabel;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.ApuGrafico;
import GameObject.GameObject;

public class Apu extends Enemigo {
	
	public Apu(int velocidad, int x, int y) {
		this.velocidad= velocidad;
		miobjetografico = new ApuGrafico("apu1.png");
		this.x=x;
		this.y=y;
	}
	
	public JLabel getGrafico(){
		return miobjetografico;
		
	}
	
	
	@Override
	public void avanzar() {
		//hilo de ejecucion avanzando con sus respectivas imagenes
	}

	@Override
	public void atacar() {
		// gif atacando
		
	}
	
	public GameObject clone() {
		return new Apu(velocidad, x, y);
	}
}
