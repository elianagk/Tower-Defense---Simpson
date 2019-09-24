package GameObject.Personajes.Enemigos;

import java.awt.Point;

import GameObject.GameObject;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.MrBurnsGrafico;
import VISITOR.Visitor;

public class MrBurns extends Enemigo {
	
	public MrBurns(int velocidad, Point posicion) {
		miobjetografico= new MrBurnsGrafico("");
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
		return new MrBurns(velocidad, position);
	}


	@Override
	public void Aceptar(Visitor visitante) {
		// TODO Auto-generated method stub
		
	}
}
