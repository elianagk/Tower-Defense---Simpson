package GameObject.Personajes.Enemigos;



import javax.swing.JLabel;

import Disparo.DisparoLogico;
import Disparo.DisparoLogicoEnemigo;
import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;

import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.MoeGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;

public class Moe extends Enemigo {
	private DisparoLogicoEnemigo disparo;
	
	public Moe(MapaLogico ml) {
		super(ml, new MoeGrafico());
		vida= 100;
		velocidad= 6;
		visitor= new VisitorEnemigo(this);
		disparo= new DisparoLogicoEnemigo(mapaLogico, this);
		da�o=80;
	}

	@Override
	public void atacar(Personaje e) {
		miObjetoGrafico.atacar();
		disparo.atacar(this);
		e.aplicarDa�o(da�o);
	}

	public GameObject clone() {
		return new Moe(mapaLogico);
	}

	public DisparoLogicoEnemigo getDisparo() {
		return disparo;
	}
}
