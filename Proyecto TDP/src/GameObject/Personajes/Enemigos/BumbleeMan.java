package GameObject.Personajes.Enemigos;

import java.awt.Point;

import GameObject.GameObject;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.ApuGrafico;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.BumbleeManGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public class BumbleeMan extends Enemigo {
	
	public BumbleeMan(MapaLogico ml) {
		super(ml, new BumbleeManGrafico());
		vida= 100;
		velocidad= 5;
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
		return new BumbleeMan(mapaLogico);
	}


	@Override
	public void Aceptar(Visitor visitante) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void aplicarDaño(int daño) {
		// TODO Auto-generated method stub
		
	}

}
