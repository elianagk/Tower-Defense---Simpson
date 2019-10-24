package GameObject.Objetos.Magias;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.Magia;
import GameObjectGrafico.ObjetosGraficos.MagiaGrafico;
import GameObjectGrafico.ObjetosGraficos.MagiasGraficas.AumentoDeDañoGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public class AumentoDeDaño extends Magia{

	public AumentoDeDaño(MapaLogico mapaLogico) {
		super(mapaLogico, new AumentoDeDañoGrafico(), 25);	//3°duracion seg
	}

	@Override
	public void accionar(Personaje c) {
		c.setDaño(50);
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
