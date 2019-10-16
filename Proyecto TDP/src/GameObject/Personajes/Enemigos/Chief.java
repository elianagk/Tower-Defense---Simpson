package GameObject.Personajes.Enemigos;



import javax.swing.JLabel;

import Disparo.DisparoLogicoEnemigo;
import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;

import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.ChiefGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;

public class Chief extends Enemigo {
	protected DisparoLogicoEnemigo disparo;
	
	public Chief(MapaLogico ml) {
		super(ml, new ChiefGrafico());
		vida= 100;
		velocidad= 6;
		visitor= new VisitorEnemigo(this);
		disparo= new DisparoLogicoEnemigo(mapaLogico, this);
		daño=10;
	}
	
	
	

	@Override
	public void atacar(Personaje e) {
		miObjetoGrafico.atacar();
		
		
		disparo.atacar(this);
		
		
		e.aplicarDaño(daño);
		
		
	}

	public GameObject clone() {
		return new Chief(mapaLogico);
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




	@Override
	public JLabel getGrafico() {
		last_dir= still_key;
		return miObjetoGrafico;
	}
}
