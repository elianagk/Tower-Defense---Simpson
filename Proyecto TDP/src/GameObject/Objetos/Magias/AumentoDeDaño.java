package GameObject.Objetos.Magias;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.Magia;
import GameObjectGrafico.ObjetosGraficos.MagiaGrafico;
import GameObjectGrafico.ObjetosGraficos.MagiasGraficas.AumentoDeDañoGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorMagia;

public class AumentoDeDaño extends Magia{

	public AumentoDeDaño(MapaLogico mapaLogico) {
		super(mapaLogico, new AumentoDeDañoGrafico(), 25);	//3°duracion seg
		visitor= new VisitorMagia(this);
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
		return new AumentoDeDaño(mapaLogico);
	}

	@Override
	public void terminarMagia() {
		// TODO Auto-generated method stub
		
	}
}
