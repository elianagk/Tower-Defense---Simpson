package Disparo;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Objeto;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public abstract class DisparoLogico extends Objeto {
	
	

	public DisparoLogico(MapaLogico ml, GameObjectGrafico gog) {
		super(ml, gog);
	
	}

	@Override
	public GameObject clone() {
		
		return null;
	}

	
	
	public  void accionar() {
		
	}
	
	public abstract void atacar(GameObject g);
	
	public JLabel getGrafico() {
		return miObjetoGrafico;
	}
	

}
