package GameObject;

import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;

public abstract class Personaje extends GameObject {
	protected int velocidad;
	protected int daño;
	protected int alcance;
	protected int jump_strenght = 10;

	public Personaje(MapaLogico ml, GameObjectGrafico gog) {
		super(ml, gog);
	}

	public abstract void atacar(Personaje e) ;
	

	public int getDaño() {
		return daño;
	}

	public void aplicarDaño(int daño) {
		if (vida > daño)
			vida -= daño;
		else {
			vida = 0;
			mapaLogico.removerEntidad(this);
		}
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

}
