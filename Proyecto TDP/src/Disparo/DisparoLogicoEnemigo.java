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
		velocidad= mipersonaje.getVelocidad()+3;
		
	}



	@Override
	public void accionar() {
		super.mover(backward_key);
		
	}



		@Override
	public void Aceptar(Visitor visitor) {
		visitor.visitarDisparo(this);
		
	}



	@Override
	public Visitor getVisitor() {
		return visitor;
	}



	@Override
	public void atacar(Personaje e) {
		super.mover(backward_key);
		e.aplicarDaño(mipersonaje.getDaño());
		System.out.println("daño a torre");
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
