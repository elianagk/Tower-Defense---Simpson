package GameObject;

import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import State.StatePersonaje.StatePersonaje;
import VISITOR.Visitor;

public abstract class Personaje extends GameObject {
	protected int velocidad;
	protected int daño;
	protected int alcanceContador;
	protected boolean accionar;		
	protected int contador;	
	protected StatePersonaje estado;
	protected int jump_strenght = 10;

	public Personaje(MapaLogico ml, GameObjectGrafico gog, int vida) {
		super(ml, gog);
		alcanceContador=50;
		accionar=true;
		this.vida=vida;
		vidaTotal=vida;		
	}
	
	public abstract boolean enContacto(Personaje e); 			
	
	public void setAccionar(boolean accionar) {
		this.accionar=accionar;
	}
	
	public int getAlcance() {
		return alcanceContador;
	}

	public void setAlcance(int alcance) {
		this.alcanceContador = alcance;
	}
	
	public void atacar(Personaje e) {
		estado.atacar(e);
	}
	
	public abstract void atacarPersonaje(Personaje e);

	public int getDaño() {
		return daño;
	}
	
	public void setDaño(int d) {
		daño=d;
	}

	public void aplicarDaño(int daño) {
		if (vida > daño)
			vida -= daño;
		else {
			vida = 0;
			esValido=false;
			mapaLogico.entidadAEliminar(this);
		}
	}
	
	protected void cambiarGrafico(String dir){
		estado.cambiarGrafico();
	}
	
	public void cambiarEstado(StatePersonaje est) {
		estado.cambiarGrafico();
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
		cambiarGrafico(dir);
	}
	
}
