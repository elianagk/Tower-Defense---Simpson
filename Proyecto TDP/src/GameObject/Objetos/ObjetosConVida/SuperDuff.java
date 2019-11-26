package GameObject.Objetos.ObjetosConVida;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.ObjetoConVida;
import GameObject.Objetos.ObjetoPrecioso;
import GameObjectGrafico.ObjetoGrafico;
import GameObjectGrafico.ObjetosGraficos.ObjetosConVida.SuperDuffGrafico;
import Mapa.MapaLogico;
import State.StatePersonaje.PersonajeOcioso;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;
import VISITOR.VisitorPrecioso;

public class SuperDuff extends ObjetoConVida {

	public SuperDuff(MapaLogico mapaLogico) {
		super(mapaLogico, new SuperDuffGrafico(mapaLogico),600);	//3°vida
		visitor= new VisitorAliado(this);
		estado=new PersonajeOcioso(this, still_key);
	}

	@Override
	public void Aceptar(Visitor visitante) {
		visitante.visitar(this);
		
	}

	@Override
	public GameObject clone() {
		return new SuperDuff(mapaLogico);
	}

	@Override
	public void atacar(Personaje e) {}

	@Override
	public void accionar(Personaje e) {
		int d= e.getDaño();
		vida= vida-d;
		if(vida<=0) {
			esValido=false;
			mapaLogico.entidadAEliminar(this);
		}
	}

	@Override
	public void atacarPersonaje(Personaje e) {

	}

	

	

	
}
