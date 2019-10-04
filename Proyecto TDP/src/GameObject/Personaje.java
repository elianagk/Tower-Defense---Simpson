package GameObject;

import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;

public abstract class Personaje extends GameObject {

	protected int daño;
	protected int alcance;

	public Personaje(MapaLogico ml, GameObjectGrafico gog) {
		super(ml, gog);
	}

	public void atacar(Personaje e) {
		e.setVida(e.getVida()-daño);
	}
	

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

}
