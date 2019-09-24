package GRAFICA;

import Juego.Juego;

public class ContadorTiempo extends Thread {

	private Juego elJuego;

	public ContadorTiempo(Juego j) {
		this.elJuego = j;
	}

	public void run() {
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			elJuego.mover();
		}
	}
}