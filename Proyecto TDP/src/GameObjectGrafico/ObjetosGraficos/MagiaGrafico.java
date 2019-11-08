package GameObjectGrafico.ObjetosGraficos;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import GameObject.Objeto;
import GameObject.Objetos.Magia;
import GameObjectGrafico.ObjetoGrafico;
import Mapa.MapaLogico;

public abstract class MagiaGrafico extends ObjetoGrafico{
	Magia magiaLogica;
	public MagiaGrafico(String s, MapaLogico ml) {
		super(s, ml);
		
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				magiaLogica.activar();
				mapaLogico.getMapaGrafico().removerEntidad(magiaLogica);
			}
		});
	}

	public void setMagiaLogica(Magia m) {
		magiaLogica=m;
	}
	
}
