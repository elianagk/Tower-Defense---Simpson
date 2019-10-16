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
		daño=80;
	}

	@Override
	public JLabel getGrafico() {
		last_dir= still_key;
		return miObjetoGrafico;
	}

	@Override
	public void atacar(Personaje e) {
		miObjetoGrafico.atacar();
		disparo.atacar(this);
		e.aplicarDaño(daño);
	}

	public GameObject clone() {
		return new Moe(mapaLogico);
	}

	@Override
	public void Aceptar(Visitor v) {
		v.visitar(this);
		
	}

	
	

	@Override
	public void accionar() {
		super.mover(backward_key);
		
	}

	@Override
	public Visitor getVisitor() {
		return visitor;
	}
	
	public DisparoLogicoEnemigo getDisparo() {
		return disparo;
	}
}
