package GameObject.Objetos.Magias;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.Magia;
import GameObjectGrafico.ObjetosGraficos.MagiaGrafico;
import GameObjectGrafico.ObjetosGraficos.MagiasGraficas.AumentoDeDa�oGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public class AumentoDeDa�o extends Magia{

	public AumentoDeDa�o(MapaLogico mapaLogico) {
		super(mapaLogico, new AumentoDeDa�oGrafico(), 25);	//3�duracion seg
	}

	@Override
	public void accionar(Personaje c) {
		c.setDa�o(50);
		mapaLogico.entidadAEliminar(this);
		
	}

	@Override
	public void Aceptar(Visitor visitante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GameObject clone() {
		// TODO Auto-generated method stub
		return null;
	}
}
