package GameObject.Personajes.Enemigos.EnemigosDisparan;


import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Disparos.DisparoLogicoEnemigo;
import GameObject.Personajes.Enemigos.EnemigoDisparo;
import GameObjectGrafico.PersonajesGrafico.EnemigosGrafico.MrBurnsGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;

public class MrBurns extends EnemigoDisparo {
	
	public MrBurns(MapaLogico ml) {
		super(ml, new MrBurnsGrafico(), 1000,300);
		velocidad= 6;
		visitor= new VisitorEnemigo(this);
		tiempo=16;
		contador=0;
		daño=95;
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
		return new MrBurns(mapaLogico);
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
