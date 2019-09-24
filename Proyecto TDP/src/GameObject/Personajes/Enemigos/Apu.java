package GameObject.Personajes.Enemigos;

import java.awt.Point;

import javax.swing.JLabel;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.ApuGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import GameObject.GameObject;

public class Apu extends Enemigo {
	
	public Apu(Point posicion, MapaLogico ml) {
		super(posicion, ml);
		vida= 100;
		velocidad= 5;
		miobjetografico = new ApuGrafico("apucaminandogif.gif");
		
		
		
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
		return null;
	}

	@Override
	public void Aceptar(Visitor visitante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aplicarDaño(int daño) {
		if(vida>=daño)
			vida-=daño;
		else {
			vida=0;
			mapaLogico.removerEntidad(this);
		}
			
	}
}
