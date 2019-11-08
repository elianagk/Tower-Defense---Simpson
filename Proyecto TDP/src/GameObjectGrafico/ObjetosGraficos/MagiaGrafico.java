package GameObjectGrafico.ObjetosGraficos;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import GameObject.Objeto;
import GameObject.Objetos.Magia;
import GameObjectGrafico.ObjetoGrafico;
import Mapa.MapaLogico;

public abstract class MagiaGrafico extends ObjetoGrafico{
	Magia magiaLogica;
	public MagiaGrafico(String s, MapaLogico ml, Magia m) {
		super(s, ml);
		magiaLogica=m;
		
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				magiaLogica.accionar();
			}
		});
	}

	
	
}
