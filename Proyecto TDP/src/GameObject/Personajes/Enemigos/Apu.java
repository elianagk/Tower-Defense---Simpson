package GameObject.Personajes.Enemigos;

import java.awt.Point;

import javax.swing.JLabel;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.ApuGrafico;
import VISITOR.Visitor;
import GameObject.GameObject;

public class Apu extends Enemigo {
	
	public Apu(int velocidad, Point posicion) {
		this.velocidad= velocidad;
		miobjetografico = new ApuGrafico("apucaminandogif.gif");
		position= posicion;
		
		
	}
	
	public JLabel getGrafico(){
		last_dir= still_key;
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
		return new Apu(velocidad, this.position);
	}

	@Override
	public void Aceptar(Visitor visitante) {
		// TODO Auto-generated method stub
		
	}
}
