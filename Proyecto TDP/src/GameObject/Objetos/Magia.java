package GameObject.Objetos;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Objeto;
import GameObject.Personaje;
import GameObjectGrafico.GameObjectGrafico;
import GameObjectGrafico.ObjetosGraficos.MagiaGrafico;
import Mapa.MapaLogico;

public abstract class Magia extends Objeto {
	protected int duracion;
	protected Personaje mipersonaje; //las magias se le aplican siempre a aliados
	
	public Magia(MapaLogico mapaLogico, GameObjectGrafico m) {
		super(mapaLogico, m);
		
	}

	@Override
	public JLabel getGrafico() {
		last_dir= still_key;
		return miObjetoGrafico;
	}
	
	
	public abstract void activar();
	
	public void accionar() {}
}
