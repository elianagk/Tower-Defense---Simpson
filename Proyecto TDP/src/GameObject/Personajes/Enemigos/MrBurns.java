package GameObject.Personajes.Enemigos;


import javax.swing.JLabel;

import Disparo.DisparoLogicoEnemigo;
import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;

import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.MrBurnsGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;

public class MrBurns extends Enemigo {
	protected DisparoLogicoEnemigo disparo;
	
	public MrBurns(MapaLogico ml) {
		super(ml, new MrBurnsGrafico());
		vida= 100;
		velocidad= 5;
		visitor= new VisitorEnemigo(this);
		disparo= new DisparoLogicoEnemigo(mapaLogico);
		da�o=95;
	}
	
	@Override
	public JLabel getGrafico() {
		last_dir= still_key;
		return miObjetoGrafico;
	}
	
	
	@Override
	public void atacar(Personaje e) {
		miObjetoGrafico.atacar();
		disparo.atacar(this);
		e.aplicarDa�o(da�o);
		
	}

	public GameObject clone() {
		return new MrBurns(mapaLogico);
	}


	@Override
	public void Aceptar(Visitor v) {
		v.visitar(this);
		
	}


	

	@Override
	public void accionar() {
		super.mover(backward_key);
		
	}


	@Override
	public Visitor getVisitor() {
		
		return visitor;
	}
}
