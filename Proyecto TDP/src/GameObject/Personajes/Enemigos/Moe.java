package GameObject.Personajes.Enemigos;

import java.awt.Point;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.ApuGrafico;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.MoeGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;

public class Moe extends Enemigo {
	
	public Moe(MapaLogico ml) {
		super(ml, new MoeGrafico());
		vida= 100;
		velocidad= 6;
		visitor= new VisitorEnemigo(this);
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
		return new Moe(mapaLogico);
	}

	@Override
	public void Aceptar(Visitor v) {
		v.visitar(this);//TODO da null pointer
		
	}

	@Override
	public void aplicarDaño(int daño) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accionar() {
		super.mover(backward_key);
		
	}

	@Override
	public Visitor getVisitor() {
		// TODO Auto-generated method stub
		return null;
	}
}
