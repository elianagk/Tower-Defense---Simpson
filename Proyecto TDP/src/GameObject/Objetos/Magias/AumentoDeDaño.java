package GameObject.Objetos.Magias;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.Magia;
import GameObjectGrafico.ObjetoGrafico;
import GameObjectGrafico.ObjetosGraficos.MagiaGrafico;
import GameObjectGrafico.ObjetosGraficos.MagiasGraficas.AumentoDeDaņoGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorMagia;

public class AumentoDeDaņo extends Magia{

	public AumentoDeDaņo(MapaLogico mapaLogico) {
		super(mapaLogico, new AumentoDeDaņoGrafico(mapaLogico), 25);	//3°duracion seg
		visitor= new VisitorMagia(this);
		ObjetoGrafico o= (ObjetoGrafico) miObjetoGrafico;
		o.setEntidad(this);
	}

	@Override
	public void accionar(GameObject o) {
		Personaje p= (Personaje) o;
		p.setDaņo(p.getDaņo()+30);
		mapaLogico.entidadAEliminar(this);
	}

	@Override
	public void Aceptar(Visitor visitante) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GameObject clone() {
		return new AumentoDeDaņo(mapaLogico);
	}

	@Override
	public void terminarMagia() {
		// TODO Auto-generated method stub
		
	}

	public void activar() {
		for(GameObject o: mapaLogico.getEntidades()) {
			o.Aceptar(visitor);
		}
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}

}
