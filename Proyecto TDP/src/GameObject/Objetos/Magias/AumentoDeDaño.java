package GameObject.Objetos.Magias;

import java.util.Random;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.Magia;
import GameObjectGrafico.ObjetosGraficos.MagiasGraficas.AumentoDeDañoGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorMagia;

public class AumentoDeDaño extends Magia{
	

	public AumentoDeDaño(MapaLogico mapaLogico) {
		super(mapaLogico, new AumentoDeDañoGrafico(mapaLogico));	//3°duracion seg
		visitor= new VisitorMagia(this);
		
	}

	@Override
	public void accionar(Personaje p) {
		p.setDaño(p.getDaño()+30);
		
			
	}

	@Override
	public void Aceptar(Visitor visitante) {
		visitante.visitar(this);
		
	}

	@Override
	public GameObject clone() {
		return new AumentoDeDaño(mapaLogico);
	}

	@Override
	public void activar() {
		for(GameObject o: mapaLogico.getEntidades()) {
			o.Aceptar(visitor);
		}
		mapaLogico.entidadAEliminar(this);
		
	}

	
	

	



}
