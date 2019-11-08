package GameObject.Personajes.Disparos;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.DisparoGrafico.DisparoGraficoTorre;
import Mapa.MapaLogico;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;




public class DisparoLogicoTorre extends Torre {
	
	protected Torre mipersonaje;
	protected int contador;
	
	public DisparoLogicoTorre(MapaLogico ml, Torre p) {
		super(ml, new DisparoGraficoTorre(),0);
		mipersonaje=p;
		visitor= new VisitorAliado(this);
		velocidad=5;
		contador=0;
		
		
	}

	
	@Override
	public void atacar(Personaje e) {
		super.mover(still_key);
		e.aplicarDaño(mipersonaje.getDaño());
		mapaLogico.entidadAEliminar(this);
		mipersonaje.setAccionar(true);
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
