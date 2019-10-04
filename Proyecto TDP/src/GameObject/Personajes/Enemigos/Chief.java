package GameObject.Personajes.Enemigos;

import java.awt.Point;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.ApuGrafico;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.ChiefGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public class Chief extends Enemigo {
	
	public Chief(MapaLogico ml) {
		super(ml, new ChiefGrafico());
		vida= 100;
		velocidad= 6;
	}
	
	
	@Override
	public void avanzar() {
		//hilo de ejecucion avanzando con sus respectivas imagenes
	}

	@Override
	public void atacar(Personaje e) {
		// gif atacando
		
	}

	public GameObject clone() {
		return new Chief(mapaLogico);
	}


	@Override
	public void Aceptar(Visitor v) {
		v.visitar(this);
		
	}


	@Override
	public void aplicarDaño(int daño) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Visitor getVisitor() {
		// TODO Auto-generated method stub
		return null;
	}
}
