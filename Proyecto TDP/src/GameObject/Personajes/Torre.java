package GameObject.Personajes;

import GameObject.Personaje;

public abstract class Torre extends Personaje {
	protected int precio;

	public Torre(int precio, int vida, int da�o, int alcance) {
		this.precio= precio;
		this.vida= vida;
		this.da�o= da�o;
		this.alcance=alcance;
	}
	
	
	
	@Override
	public abstract void atacar() ;
	//DEBERIAMOS SABER A QUIEN ATACAMOS PARA PODER SACARLE VIDA

}
