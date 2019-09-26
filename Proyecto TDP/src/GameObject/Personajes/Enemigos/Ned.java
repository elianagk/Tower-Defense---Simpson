package GameObject.Personajes.Enemigos;

import java.awt.Point;

import GameObject.GameObject;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.ApuGrafico;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.NedGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public class Ned extends Enemigo {
	
	public Ned(MapaLogico ml) {
		super(ml, new NedGrafico());
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
		return new Ned(mapaLogico);
	}

	@Override
	public void Aceptar(Visitor visitante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aplicarDa�o(int da�o) {
		// TODO Auto-generated method stub
		
	}
}
