package VISITOR;

import GameObject.GameObject;
import GameObject.Objeto;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;
import Mapa.MapaLogico;

public abstract class Visitor {
	
	protected Personaje mipersonaje;
	
	public abstract void visitar(Enemigo e);
	public  abstract void visitar(Torre t);
	public abstract void visitar(Objeto o);

	
	
	

}
