package GameObject.Personajes;

import java.awt.Point;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Disparos.DisparoLogicoEnemigo;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;

public abstract class Torre extends Personaje {
	protected int tiempo;

	public Torre(MapaLogico mapaLogico, GameObjectGrafico gog, int vida) {
		super(mapaLogico, gog, vida);		
		velocidad=0;		
		tiempo=15;
	}	
	
	public void accionar() {
		if (accionar) {
			miObjetoGrafico.accionar();
			super.mover(still_key);
		}
	}

	@Override
	public void atacar(Personaje e) {
		accionar=false;			
		miObjetoGrafico.atacar();	
		contador++;
		
		if (contador>=tiempo) {						
			e.aplicarDaño(daño);	
			contador=0;
		}		
		
		if (!e.getEsValido()) { 
			accionar=true;		
			mover(still_key);
		}
	}
	
	@Override
	public void Aceptar(Visitor v) {
		v.visitar(this);
	}
	
	public boolean estaEnRango(GameObject g) {
		return (g.getX()>=getX() && g.getX()<=this.getX()+350 && g.getY()==this.getY())   ;
	}
	
	
	
}
