package GameObject.Personajes.Enemigos;



import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Disparos.DisparoLogicoEnemigo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.MoeGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;

public class Moe extends Enemigo {
	private int tiempo;
	private int contador;
	
	
	public Moe(MapaLogico ml) {
		super(ml, new MoeGrafico());
		vida=300;
		velocidad= 6;
		visitor= new VisitorEnemigo(this);
		tiempo=20;
		contador=0;
		daño=25;
		
	}

	@Override
	public void atacar(Personaje e) {
		accionar=false;	
		if (e.getX()>=this.getX()-100 && e.getX()<=getX() && e.getY()==this.getY()) {				
			super.mover(still_key);
		}
		else
			super.mover(backward_key);
		miObjetoGrafico.atacar();
		contador++;
		if (contador>=tiempo) {
			mapaLogico.disparoAAgregar(new DisparoLogicoEnemigo(mapaLogico, this), this.getX()-50, this.getY());
			contador=0;
		}	
		if (!e.getEsValido())
			accionar=true;
	}

	public GameObject clone() {
		return new Moe(mapaLogico);
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
		}			

	}
	
}
