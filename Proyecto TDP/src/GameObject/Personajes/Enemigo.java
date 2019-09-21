package GameObject.Personajes;

import GameObject.Personaje;

public abstract  class Enemigo extends Personaje {
	protected int velocidad;
	protected int puntaje;
	protected int costo;
	
	
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
	
	public int getCosto() {
		return costo;
	}
	
	public void setCosto(int costo) {
		this.costo = costo;
	}
	
	protected void cambiarGrafico(int dir){
		if(this.miobjetografico != null){
			this.miobjetografico.cambiarPosicion();
			this.miobjetografico.setBounds(getX(), getY(), width, height);
		}
	}
	
	public void mover(int dir){	
		switch (dir) {
			case 0 : {//Arriba
				setX(x);
				setY(y-velocidad);		
				break;
			}
			case 1 : {//Abajo
				setX(x);
				setY(y+velocidad);
				break;
			}
			case 2 : {//Izquierda
				setX(x-velocidad);
				setY(y);
				break;
			}
			case 3 : {//Derecha
				setX(x+velocidad);
				setY(y);
				break;
			}
		}
		cambiarGrafico(dir);
	}
	
	public abstract  void avanzar();
	
	@Override
	public abstract void atacar() ;
	//DEBERIAMOS SABER A QUIEN ATACAMOS PARA PODER SACARLE VIDA
	
	
	
}
