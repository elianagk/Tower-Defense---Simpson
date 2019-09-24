package VISITOR;

import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;
import Mapa.MapaLogico;

public interface Visitor {
	
	
	
	public void visitar(Enemigo e);
	public void visitar(Torre t);
	public void visitar(Object o);
	

}
