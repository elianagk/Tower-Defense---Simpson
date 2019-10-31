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
	private int tiempo;
	private int contador;
	
	public MrBurns(MapaLogico ml) {
		super(ml, new MrBurnsGrafico());
		vida= 100;
		velocidad= 6;
		visitor= new VisitorEnemigo(this);
		tiempo=20;
		contador=0;
		daño=95;
	}
	
	@Override
	public void atacar(Personaje e) {
		super.mover(backward_key);
		miObjetoGrafico.atacar();
		contador++;
		if (contador==tiempo) {
			mapaLogico.entidadAAgregar(new DisparoLogicoEnemigo(mapaLogico, this), this.getX()-50, this.getY());
			contador=0;
		}
		
	}

	public GameObject clone() {
		return new MrBurns(mapaLogico);
	}
	
	@Override
	public void accionar() {
//		if (posicion.x<=0) 
//			mapaLogico.gameOver();
//		else {
			super.mover(backward_key);
			miObjetoGrafico.atacar();
			contador++;
			if (contador==tiempo) {
				mapaLogico.entidadAAgregar(new DisparoLogicoEnemigo(mapaLogico, this), this.getX()-50, this.getY());
				contador=0;
			}
		//}
	}
	
	
}
