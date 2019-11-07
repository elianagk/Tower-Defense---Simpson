package GameObject;

import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public abstract class Personaje extends GameObject {
	protected int velocidad;
	protected int daño;
	protected int alcance;
	protected boolean accionar;		

	protected int jump_strenght = 10;

	public Personaje(MapaLogico ml, GameObjectGrafico gog) {
		super(ml, gog);
		accionar=true;
	}

	public int getAlcance() {
		return alcance;
	}

	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}
	
	public void atacar(Personaje e) {
		accionar=false;
		miObjetoGrafico.atacar();
		mover(still_key);
		e.aplicarDaño(daño);
		if (!e.getEsValido())
			accionar=true;
	}

	public int getDaño() {
		return daño;
	}
	
	public void setDaño(int d) {
		daño+=d;
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
		if(miObjetoGrafico != null) {
			miObjetoGrafico.accionar();
			miObjetoGrafico.setBounds(posicion.x, posicion.y, 100, 100);
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
	
	
}
