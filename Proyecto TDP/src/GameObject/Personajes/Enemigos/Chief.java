package GameObject.Personajes.Enemigos;



import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Disparos.DisparoLogicoEnemigo;
import GameObject.Personajes.Disparos.DisparoLogicoTorre;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.ChiefGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;

public class Chief extends Enemigo {
	private int tiempo;
	private int contador;
	
	public Chief(MapaLogico ml) {
		super(ml, new ChiefGrafico());
		vida= 300;
		velocidad= 6;
		visitor= new VisitorEnemigo(this);
		tiempo=20;
		contador=0;
		daño=50;
	}
	
	@Override
	public void atacar(Personaje e) {
		accionar=false;
		super.mover(still_key);
		miObjetoGrafico.atacar();
		contador++;
		if (contador==tiempo) {
			mapaLogico.entidadAAgregar(new DisparoLogicoEnemigo(mapaLogico, this), this.getX()-50, this.getY());
			contador=0;
		}
		
		if (!e.getEsValido())
			accionar=true;		
	}

	public GameObject clone() {
		return new Chief(mapaLogico);
	}
	
	@Override
	public void accionar() {
		if (posicion.x<=0)
			mapaLogico.gameOver();
		else {
			if (accionar) {
				super.mover(backward_key);
				miObjetoGrafico.accionar();
			}
			contador++;
			
		}
		
	
	}
	
	
}
