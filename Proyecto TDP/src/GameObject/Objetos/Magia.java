package GameObject.Objetos;

import javax.swing.JLabel;

import GameObject.Objeto;
import GameObjectGrafico.ObjetosGraficos.MagiaGrafico;
import Mapa.MapaLogico;

public class Magia extends Objeto {

	public Magia(MapaLogico mapaLogico) {
		super(mapaLogico, new MagiaGrafico());
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
