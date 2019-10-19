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
		da�o=10;
	}
	
	@Override
	public void atacar(Personaje e) {
		miObjetoGrafico.atacar();
		disparo.atacar(this);
		e.aplicarDa�o(da�o);
	}

	public GameObject clone() {
		return new Chief(mapaLogico);
	}
	
	public DisparoLogicoEnemigo getDisparo() {
		return disparo;
	}
}
