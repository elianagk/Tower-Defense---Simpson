package GameObject.Personajes.Enemigos.EnemigosDisparan;



import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Disparos.DisparoLogicoEnemigo;
import GameObject.Personajes.Enemigos.EnemigoDisparo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.MoeGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;

public class Moe extends EnemigoDisparo {		
	
	public Moe(MapaLogico ml) {
		super(ml, new MoeGrafico(), 550, 300);		
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
			atacando=true;
			super.mover(still_key);
		}
		else {
			if (!atacando)
				super.mover(backward_key);
		}
		miObjetoGrafico.atacar();
		contador++;
		if (contador>=tiempo) {
			mapaLogico.disparoAAgregar(new DisparoLogicoEnemigo(mapaLogico, this), this.getX()-50, this.getY());
			contador=0;
		}	
		if (!e.getEsValido()) {
			accionar=true;
			atacando=false;
		}
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
