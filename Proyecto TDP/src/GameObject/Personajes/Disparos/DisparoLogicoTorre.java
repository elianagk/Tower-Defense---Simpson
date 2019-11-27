package GameObject.Personajes.Disparos;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Torre;
import GameObjectGrafico.PersonajesGrafico.DisparoGrafico.DisparoGraficoTorre;
import Mapa.MapaLogico;
import State.StatePersonaje.PersonajeOcioso;
import VISITOR.Visitor;
import VISITOR.VisitorAliado;




public class DisparoLogicoTorre extends Torre {
	
	protected Torre mipersonaje;
	
	public DisparoLogicoTorre(MapaLogico ml, Torre p) {
		super(ml, new DisparoGraficoTorre(),0);
		mipersonaje=p;
		visitor= new VisitorAliado(this);
		velocidad=5;
		contador=0;
		estado=new PersonajeOcioso(this, forward_key);		
	}

	@Override
	public void atacarPersonaje(Personaje e) {
		super.mover(still_key);
		e.aplicarDa�o(mipersonaje.getDa�o());
		mapaLogico.entidadAEliminar(this);
		if (!e.getEsValido()) {
			mipersonaje.setAccionar(true);			
		}
	}

	@Override
	public void accionar() {
		estado.accionar();
//		super.mover(forward_key);
//		contador++;
//		if (contador==mipersonaje.getAlcance()) {
//			mapaLogico.entidadAEliminar(this);
//		}
//		
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
