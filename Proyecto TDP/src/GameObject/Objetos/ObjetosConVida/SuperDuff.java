package GameObject.Objetos.ObjetosConVida;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.ObjetoConVida;
import GameObject.Objetos.ObjetoPrecioso;
import GameObjectGrafico.ObjetoGrafico;
import GameObjectGrafico.ObjetosGraficos.ObjetosConVida.SuperDuffGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorPrecioso;

public class SuperDuff extends ObjetoConVida {

	public SuperDuff(MapaLogico mapaLogico) {
		super(mapaLogico, new SuperDuffGrafico(mapaLogico),500);	//3°vida
		
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
		// TODO Auto-generated method stub
		
	}

	

	

	
}
