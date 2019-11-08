package GameObject.Objetos.ObjetosConVida;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.ObjetoConVida;
import GameObjectGrafico.GameObjectGrafico;
import GameObjectGrafico.ObjetosGraficos.ObjetosConVida.MaggieGrafica;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public class Maggie extends ObjetoConVida {

	public Maggie(MapaLogico ml, GameObjectGrafico gog, int vida) {
		super(ml, new MaggieGrafica(ml), 900);
		
	}

	@Override
	public void Aceptar(Visitor visitante) {
		visitante.visitar(this);
	}

	@Override
	public GameObject clone() {
		return new Maggie(mapaLogico, miObjetoGrafico, vida);
	}

	@Override
	public void accionar(Personaje e) {
		// TODO Auto-generated method stub
		
	}

}
