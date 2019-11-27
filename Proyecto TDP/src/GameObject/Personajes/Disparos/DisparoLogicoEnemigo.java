package GameObject.Personajes.Disparos;



import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;
import GameObjectGrafico.PersonajesGrafico.DisparoGrafico.DisparoGraficoEnemigo;
import Mapa.MapaLogico;
import State.StatePersonaje.PersonajeOcioso;
import VISITOR.Visitor;
import VISITOR.VisitorEnemigo;


public class DisparoLogicoEnemigo extends Enemigo {
	
	protected Enemigo mipersonaje;
	
	public DisparoLogicoEnemigo(MapaLogico ml, Enemigo p) {
		super(ml, new DisparoGraficoEnemigo(),0,0);
		mipersonaje=p;
		visitor= new VisitorEnemigo(this);
		velocidad= mipersonaje.getVelocidad()+3;
		contador=0;
		estado=new PersonajeOcioso(this, backward_key);		
	}

	@Override
	public void atacarPersonaje(Personaje e) {
		if (e.getX()>=this.getX()-100 && e.getX()<=getX() && e.getY()==this.getY()) {
//			super.mover(still_key);
			e.aplicarDaño(mipersonaje.getDaño());
			mapaLogico.entidadAEliminar(this);			
		}		
	}

	@Override
	public void accionar() {
		contador++;
		if (contador>=mipersonaje.getAlcance()) {
			mapaLogico.entidadAEliminar(this);
		}
		estado.accionar();
//		super.mover(backward_key);
		
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
		return new DisparoLogicoEnemigo(mapaLogico, mipersonaje);
	}

	@Override
	public boolean cambiarGrafico(Personaje e) {
		// TODO Auto-generated method stub
		return false;
	}

}
