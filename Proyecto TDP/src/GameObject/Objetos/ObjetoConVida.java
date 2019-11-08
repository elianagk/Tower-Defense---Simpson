package GameObject.Objetos;

import GameObject.GameObject;
import GameObject.Objeto;
import GameObject.Personaje;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public abstract class ObjetoConVida extends ObjetosSinMagia{
	
	

	public ObjetoConVida(MapaLogico ml, GameObjectGrafico gog, int vida) {
		super(ml, gog);
		this.vida=vida;
	}

	@Override
	public abstract void Aceptar(Visitor visitante);

	@Override
	public abstract GameObject clone();

	@Override
	public abstract void accionar(Personaje e) ;

	public void accionar() {}
	

	

	

}
