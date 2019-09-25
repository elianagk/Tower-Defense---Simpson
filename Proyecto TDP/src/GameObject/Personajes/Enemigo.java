package GameObject.Personajes;

import java.awt.Point;

import GameObject.Personaje;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;

public abstract  class Enemigo extends Personaje {
	protected int velocidad;
	protected int puntaje;
	protected int monedas;
	protected int jump_strenght = 10;
	
	
	public Enemigo(MapaLogico ml, GameObjectGrafico gog) {
		super(ml, gog);
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	public int getMonedas() {
		return monedas;
	}
	
	public void setMonedas(int monedas) {
		this.monedas = monedas;
	}
	
	protected void cambiarGrafico(String dir){
		if(miObjetoGrafico != null) {
			miObjetoGrafico.cambiarPosicion();
			miObjetoGrafico.setBounds(posicion.x, posicion.y, 90, 100);
		}
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
	
	public void fall(int gravity){
		posicion.setLocation(posicion.x, posicion.y + gravity);
		this.cambiarGrafico(this.last_dir);
	}
	
	
	
	public abstract  void avanzar();
	
	@Override
	public abstract void atacar() ;
	//DEBERIAMOS SABER A QUIEN ATACAMOS PARA PODER SACARLE VIDA
	
	
	
}
