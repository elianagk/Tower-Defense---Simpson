package GameObject.Objetos;

import GameObject.GameObject;
import GameObject.Objeto;
import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public abstract class ObjetoConVida extends Torre{
	
	

	public ObjetoConVida(MapaLogico ml, GameObjectGrafico gog, int vida) {
		super(ml, gog, vida);
		daño= 0;
		velocidad= 0;
	}

	@Override
	public abstract void Aceptar(Visitor visitante);

	@Override
	public abstract GameObject clone();

	abstract public void accionar(Personaje e);
	
	public void accionar() {}
	

	

	

}
