package GameObject;

import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import State.StatePersonaje.StatePersonaje;
import VISITOR.Visitor;

public abstract class Personaje extends GameObject {
	protected int velocidad;
	protected int da�o;
	protected int alcanceContador;	
	protected int contador;	
	protected StatePersonaje estado;
	protected int jump_strenght = 10;

	public Personaje(MapaLogico ml, GameObjectGrafico gog, int vida) {
		super(ml, gog);
		alcanceContador=50;
		this.vida=vida;
		vidaTotal=vida;		
	}
	
	public abstract boolean enContacto(Personaje e);
	
	public abstract boolean cambiarGrafico(Personaje e);
	
	public abstract boolean primerPersonajeMasCercano(Personaje e1, Personaje e2);
	
	public int getAlcance() {
		return alcanceContador;
	}

	public void setAlcance(int alcance) {
		this.alcanceContador = alcance;
	}
	
	public void atacar(Personaje e) {
		estado.atacar(e);
	}
	
	@Override
	public void accionar() {
		estado.accionar();
	}
	
	public abstract void atacarPersonaje(Personaje e);

	public int getDa�o() {
		return da�o;
	}
	
	public void setDa�o(int d) {
		da�o=d;
	}

	public void aplicarDa�o(int da�o) {
		if (vida > da�o)
			vida -= da�o;
		else {
			vida = 0;
			esValido=false;
			mapaLogico.entidadAEliminar(this);
		}
	}
	
	public void cambiarGrafico(){
		estado.cambiarGrafico();		
	}
	
	public void cambiarEstado(StatePersonaje est) {
		this.estado=est;
	}
	
	public void mover(String dir){	
		switch (dir) {
			case jump_key : //Jump
				posicion.setLocation(posicion.x, posicion.y - jump_strenght);
				break;
			case forward_key : //Avanzar
				
				posicion.setLocation(posicion.x + velocidad, posicion.y);
				break;
			case backward_key : //Retroceder
				posicion.setLocation(posicion.x - velocidad, posicion.y);
				break;
			default : //Cualquier otra cosa - Quieto
				dir = still_key;
				break;
		}
		this.last_dir = dir;	
		
		getGrafico().setBounds(getX(), getY(), 100, 100);
		getGrafico().repaint();
	}
	
}
