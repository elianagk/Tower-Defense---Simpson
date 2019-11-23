package GameObject.Objetos.ObjetosConVida;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.ObjetoConVida;
import GameObject.Objetos.ObjetoPrecioso;
import GameObjectGrafico.ObjetoGrafico;
import GameObjectGrafico.ObjetosGraficos.ObjetosConVida.SuperDuffGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorConVida;
import VISITOR.VisitorPrecioso;

public class SuperDuff extends ObjetoConVida {

	public SuperDuff(MapaLogico mapaLogico) {
		super(mapaLogico, new SuperDuffGrafico(mapaLogico),500);	//3°vida
		visitor= new VisitorConVida(this);
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
	public void accionar(Personaje e) {
		int d= e.getDaño();
		vida= vida-d;
		if(vida<=0)
			mapaLogico.entidadAEliminar(this);
	}

	

	

	
}
