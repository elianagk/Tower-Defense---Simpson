package GameObject;

import java.awt.Point;

import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;

public abstract class Personaje extends GameObject {
	
	

	protected int daño;
	protected int alcance;
	
	public Personaje(MapaLogico ml, GameObjectGrafico gog) {
		super(ml, gog);
	}
	
	public abstract void atacar();
	//DEBERIAMOS SABER A QUIEN ATACAMOS PARA PODER SACARLE VIDA
	
	public void aplicarDaño(int daño) {
		if(vida>daño)
			vida-=daño;
		else {
			vida=0;
			mapaLogico.removerEntidad(this);
		}
	}
	
}
