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
		disparo= new DisparoLogicoEnemigo(mapaLogico, this);
		daño=95;
	}
	
	@Override
	public void atacar(Personaje e) {
		miObjetoGrafico.atacar();
		disparo.atacar(this);
		e.aplicarDaño(daño);
		
	}

	public GameObject clone() {
		return new MrBurns(mapaLogico);
	}
	
	public DisparoLogicoEnemigo getDisparo() {
		return disparo;
	}
}
