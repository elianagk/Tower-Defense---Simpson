package Disparo;

import javax.swing.JLabel;

import GameObject.GameObject;
import GameObject.Personaje;
import GameObjectGrafico.GameObjectGrafico;
import Mapa.MapaLogico;
import VISITOR.Visitor;

public abstract class DisparoLogico extends Personaje {
	protected Personaje mipersonaje;
	protected Visitor visitor;
	protected int contador;
	
	

	public DisparoLogico(MapaLogico ml, GameObjectGrafico gog) {
		super(ml, gog);
	
	}

	@Override
	public boolean estaEnRango(GameObject g) {
		return (g.getX()==this.getX() && g.getY()==this.getY())   ;
	}
	
	public abstract GameObject clone() ;
	
	
	public abstract void accionar() ;
	
	
	
	public JLabel getGrafico() {
		return miObjetoGrafico;
	}
	

}
