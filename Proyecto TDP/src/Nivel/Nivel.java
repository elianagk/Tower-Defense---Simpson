package Nivel;

import java.awt.Point;

import GameObject.GameObject;
import GameObject.Personajes.Enemigos.Apu;
import GameObject.Personajes.Enemigos.Barney;
import GameObject.Personajes.Enemigos.BumbleeMan;
import GameObject.Personajes.Enemigos.Chief;
import GameObject.Personajes.Enemigos.Moe;
import GameObject.Personajes.Enemigos.MrBurns;
import Hordas.Horda;
import Juego.Juego;
import Mapa.MapaLogico;

public class Nivel {
	private Horda horda;
	private Juego juego;
	private MapaLogico mapaLogico;
	
	public Nivel(Juego juego, MapaLogico mapaLogico) {
		this.juego= juego;
		this.mapaLogico= mapaLogico;
		horda= new Horda(this, mapaLogico, 100);
	}
	
	public void ejecutarHorda() {
		GameObject g=null;
		while(!horda.finalizarHorda()) {
			g= horda.crearEnemigo();
			mapaLogico.entidadAAgregar(g, g.getX(), g.getY());
		}
		
//		horda= new Horda(this, mapaLogico, 2);
//		
//		juego.addEnemigo(horda.crearEnemigo());
//		juego.addEnemigo(horda.crearEnemigo());
<<<<<<< HEAD
		mapaLogico.entidadAAgregar(juego.enemigos[0], juego.enemigos[0].getX(),juego.enemigos[0].getY());
//		mapaLogico.entidadAAgregar(juego.enemigos[1], juego.enemigos[1].getX(),juego.enemigos[1].getY());
//		mapaLogico.entidadAAgregar(juego.enemigos[2], juego.enemigos[2].getX(),juego.enemigos[2].getY());
=======
//		mapaLogico.entidadAAgregar(juego.enemigos[0], juego.enemigos[0].getX(),juego.enemigos[0].getY());
//		mapaLogico.agregarEntidad(juego.enemigos[1], juego.enemigos[1].getX(),juego.enemigos[1].getY());
//		mapaLogico.agregarEntidad(juego.enemigos[2], juego.enemigos[2].getX(),juego.enemigos[2].getY());
>>>>>>> branch 'master' of https://github.com/elianagk/proyectoTDP.git
	}
	
	public void ejecutarHordas() {
		ejecutarHorda();
	}
	
	public void finalizarNivel() {
		
	}
}
