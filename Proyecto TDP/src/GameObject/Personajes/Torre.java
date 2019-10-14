package GameObject.Personajes;

import GameObject.Personaje;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;

public abstract class Torre extends Personaje {
	protected int precio;
	protected VisitorAliado visitor;

	public Torre(int precio, int vida, int daño, int alcance, MapaLogico mapaLogico, GameObjectGrafico gog) {
		super(mapaLogico, gog);
		this.precio= precio;
		this.vida= vida;
		this.daño= daño;
		this.alcance=alcance;
	}
	
	
	
	@Override
	public  void atacar(Personaje e) {
		//miObjetoGrafico.atacar();
		
	}
	//DEBERIAMOS SABER A QUIEN ATACAMOS PARA PODER SACARLE VIDA

	
	
	public void aceptar(Visitor v) {
		
	}
	
	
	
}
