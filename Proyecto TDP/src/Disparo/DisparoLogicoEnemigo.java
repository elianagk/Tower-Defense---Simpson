package Disparo;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;


public class DisparoLogicoEnemigo extends Enemigo {
	
	protected Enemigo mipersonaje;
	
	public DisparoLogicoEnemigo(MapaLogico ml, Enemigo p) {
		super(ml, new DisparoGraficoEnemigo());
		mipersonaje=p;
		visitor= new VisitorEnemigo(this);
		velocidad=5;
		
	}



	@Override
	public void accionar() {
		super.mover(backward_key);
		
	}



		@Override
	public void Aceptar(Visitor visitor) {
		visitor.visitar(this);
		
	}



	@Override
	public Visitor getVisitor() {
		return visitor;
	}



	@Override
	public void atacar(Personaje e) {
		
		e.aplicarDaño(mipersonaje.getDaño());
		mapaLogico.entidadAEliminar(this);
		
	}




	@Override
	public JLabel getGrafico() {
		
		return miObjetoGrafico;
	}







	@Override
	public GameObject clone() {
		return new DisparoLogicoEnemigo(mapaLogico, mipersonaje);
	}







	

}
