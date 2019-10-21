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
	private int tiempo;
	private int contador;
	
	
	public Moe(MapaLogico ml) {
		super(ml, new MoeGrafico());
		vida= 100;
		velocidad= 6;
		visitor= new VisitorEnemigo(this);
		tiempo=10;
		contador=0;
		daño=80;
	}

	@Override
	public void atacar(Personaje e) {
		super.mover(still_key);
		miObjetoGrafico.atacar();
		contador++;
		if (contador==tiempo) {
			mapaLogico.entidadAAgregar(new DisparoLogicoEnemigo(mapaLogico, this), this.getX()-50, this.getY());
			contador=0;
		}
	}

	public GameObject clone() {
		return new Moe(mapaLogico);
	}

	
}
