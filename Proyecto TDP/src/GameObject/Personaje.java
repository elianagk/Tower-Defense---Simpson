package GameObject;

import Mapa.MapaLogico;

public abstract class Personaje extends GameObject {
	
	

	protected int da�o;
	protected int alcance;
	protected MapaLogico mapaLogico;
	
	
	public abstract void atacar();
	//DEBERIAMOS SABER A QUIEN ATACAMOS PARA PODER SACARLE VIDA
	
	public abstract void aplicarDa�o(int da�o); 
	
}
