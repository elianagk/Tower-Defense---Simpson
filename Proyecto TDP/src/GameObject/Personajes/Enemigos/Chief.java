package GameObject.Personajes.Enemigos;

import java.awt.Point;

import GameObject.GameObject;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.ChiefGrafico;
import VISITOR.Visitor;

public class Chief extends Enemigo {
	
	public Chief(int velocidad, Point posicion) {
		miobjetografico= new ChiefGrafico("");
		this.velocidad= velocidad;
		position= posicion;
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
		return new Chief(velocidad, position);
	}


	@Override
	public void Aceptar(Visitor visitante) {
		// TODO Auto-generated method stub
		
	}
}
