package Disparo;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;
import VISITOR.VisitorDisparoAliado;



public class DisparoLogicoTorre extends DisparoLogico {
	
	protected Torre mipersonaje;
	
	public DisparoLogicoTorre(MapaLogico ml, Torre p) {
		super(ml, new DisparoGraficoTorre());
		mipersonaje=p;
		visitor= new VisitorDisparoAliado(this);
		velocidad=5;
		contador=0;
		
		
	}

	
	@Override
	public void atacar(Personaje e) {
		super.mover(still_key);
		e.aplicarDaño(mipersonaje.getDaño());
		mapaLogico.entidadAEliminar(this);
		
	}

	@Override
	public void accionar() {
		super.mover(forward_key);
		contador++;
		if (contador==mipersonaje.getAlcance()) {
			mapaLogico.entidadAEliminar(this);
		}
		
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
	public GameObject clone() {
		
		return new DisparoLogicoTorre(mapaLogico, mipersonaje);
	}
	
	

	

}
