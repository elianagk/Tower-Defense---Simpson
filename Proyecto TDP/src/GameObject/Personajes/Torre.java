package GameObject.Personajes;

import GameObject.Personaje;
import GameObjectGrafico.GameObjectGrafico;

public abstract class Torre extends Personaje {
	protected int precio;

	public Torre(int precio, int vida, int daño, int alcance, GameObjectGrafico gog) {
		super(new Point(this.getX(), this.getY()), , gog);
		this.precio= precio;
		this.vida= vida;
		this.daño= daño;
		this.alcance=alcance;
	}
	
	
	
	@Override
	public abstract void atacar() ;
	//DEBERIAMOS SABER A QUIEN ATACAMOS PARA PODER SACARLE VIDA

}
