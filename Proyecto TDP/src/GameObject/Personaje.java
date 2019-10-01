package GameObject;

import java.awt.Point;

import javax.swing.ImageIcon;

import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;

public abstract class Personaje extends GameObject {
	
	

	protected int da�o;
	protected int alcance;
	
	public Personaje(MapaLogico ml, GameObjectGrafico gog) {
		super(ml, gog);
	}
	
	public abstract void atacar();
	//DEBERIAMOS SABER A QUIEN ATACAMOS PARA PODER SACARLE VIDA
	
	public int getDa�o() {
		return da�o;
	}
	
	public void aplicarDa�o(int da�o) {
		if(vida>da�o)
			vida-=da�o;
		else {
			vida=0;
			mapaLogico.removerEntidad(this);
		}
	}
	
}
