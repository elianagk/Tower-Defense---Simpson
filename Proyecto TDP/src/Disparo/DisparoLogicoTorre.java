package Disparo;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;


public class DisparoLogicoTorre extends Torre {
	
	protected Torre mipersonaje;
	
	public DisparoLogicoTorre(MapaLogico ml, Torre p) {
		super(0, 0, 0, 0, ml, new DisparoGraficoTorre());
		mipersonaje=p;
		visitor= new VisitorAliado(this);
		velocidad=5;
		
		
	}

	
//	

	@Override
	public void accionar() {
		
		super.mover(forward_key);
		
	}


	@Override
	public void atacar(Personaje e) {
		e.aplicarDaño(mipersonaje.getDaño());
		mapaLogico.entidadAEliminar(this);
		
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
	public JLabel getGrafico() {
		return miObjetoGrafico;
	}


	@Override
	public GameObject clone() {
		
		return new DisparoLogicoTorre(mapaLogico, mipersonaje);
	}
	
	

	

}
