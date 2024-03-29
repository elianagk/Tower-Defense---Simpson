package GameObject.Objetos.ObjetosConVida;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Objetos.ObjetoConVida;
import GameObjectGrafico.GameObjectGrafico;
import GameObjectGrafico.ObjetosGraficos.ObjetosConVida.MaggieGrafica;
import Mapa.MapaLogico;
import State.StatePersonaje.PersonajeOcioso;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;

public class Maggie extends ObjetoConVida {

	public Maggie(MapaLogico ml) {
		super(ml, new MaggieGrafica(ml), 10000);
		visitor= new VisitorAliado(this);
		estado= new PersonajeOcioso(this, still_key);
	}

	@Override
	public void Aceptar(Visitor visitante) {
		visitante.visitar(this);
	}

	@Override
	public GameObject clone() {
		return new Maggie(mapaLogico);
	}

	@Override
	public void accionar() {		
	}
		
	@Override
	public void atacarPersonaje(Personaje e) {
		esValido= false;
		mapaLogico.entidadAEliminar(this);
		e.aplicarDaņo(e.getVidaTotal());
		mapaLogico.entidadAEliminar(e);
	}

	@Override
	public void accionar(Personaje e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean cambiarGrafico(Personaje e) {
		// TODO Auto-generated method stub
		return false;
	}

}
