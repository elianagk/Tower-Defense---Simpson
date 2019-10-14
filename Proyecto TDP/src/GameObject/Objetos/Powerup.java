package GameObject.Objetos;

import javax.swing.JLabel;

import GameObject.Objeto;
import GameObjectGrafico.ObjetosGraficos.PowerupGrafico;
import Mapa.MapaLogico;

public class Powerup extends Objeto {

	public Powerup(MapaLogico mapaLogico) {
		super(mapaLogico, new PowerupGrafico());
	}

	@Override
	public void accionar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public JLabel getGrafico() {
		last_dir= still_key;
		return miObjetoGrafico;
	}
}
