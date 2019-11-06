package GameObjectGrafico;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import GameObject.Objeto;
import Mapa.MapaLogico;

public abstract class ObjetoGrafico extends GameObjectGrafico {
	protected MapaLogico mapaLogico;
	protected Objeto objeto;
	
	public ObjetoGrafico(String s, MapaLogico ml) {
		super(s);
		mapaLogico= ml;
//		this.addMouseListener(new MouseAdapter() {
//			public void mouseClicked(MouseEvent e) {
//				activar();	//this referencia a mouse adapter lol
//			}
//		});
	}

	public  void accionar() {}
	
	public void atacar() {}
	
	public void setEntidad(Objeto o) {
		objeto= o;
	}
	
	public void activar() {
		objeto.activar();
	}
}
