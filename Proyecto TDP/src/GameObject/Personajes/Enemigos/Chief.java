package GameObject.Personajes.Enemigos;



import javax.swing.JLabel;

import Disparo.DisparoLogicoEnemigo;
import Disparo.DisparoLogicoTorre;
import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;

import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.ChiefGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;

public class Chief extends Enemigo {
	private int tiempo;
	private int contador;
	
	public Chief(MapaLogico ml) {
		super(ml, new ChiefGrafico());
		vida= 100;
		velocidad= 6;
		visitor= new VisitorEnemigo(this);
		tiempo=10;
		contador=0;
		da�o=10;
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
		return new Chief(mapaLogico);
	}
	
	
}
