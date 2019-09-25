package GameObject;

import java.awt.Point;

import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;

public abstract class Personaje extends GameObject {
	
	

	protected int daño;
	protected int alcance;
	
	public Personaje(Point p, MapaLogico ml, GameObjectGrafico gog) {
		super(p, ml, gog);
	}
	
	public abstract void atacar();
	//DEBERIAMOS SABER A QUIEN ATACAMOS PARA PODER SACARLE VIDA
	
	public abstract void aplicarDaño(int daño); 
	
}
