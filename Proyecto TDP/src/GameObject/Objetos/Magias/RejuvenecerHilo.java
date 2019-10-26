package GameObject.Objetos.Magias;

import javax.swing.JLabel;

import GRAFICA.MapaGrafico;
import GameObject.Objetos.HiloAnimacionMagias;
import GameObject.Objetos.Magia;


public class RejuvenecerHilo extends HiloAnimacionMagias{

	public RejuvenecerHilo(Magia magia) {
		
		super(magia);
		this.tiempo=10000;
	}

}
