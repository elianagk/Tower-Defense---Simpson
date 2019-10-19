package Juego;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

import GRAFICA.ContadorTiempo;
import GRAFICA.MapaGrafico;
import GameObject.GameObject;
import GameObject.Personaje;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Enemigos.Apu;
import Jugador.Jugador;
import Mapa.MapaLogico;
import Nivel.Nivel;
import VISITOR.Visitor;



public class Juego {
	
	public Enemigo enemigos[];
	private int i;
	private Nivel niveles[];
	private Jugador jugador;
	private MapaGrafico mapaGrafico;
	private MapaLogico mapaLogico;
	private final int gravity_force = 5;
	private final int ground_position = 400;
	
	
	
	public Juego(MapaGrafico gui, MapaLogico mapaLogico){
		niveles= new Nivel[1];
		niveles[0]= new Nivel(this, mapaLogico);
		mapaGrafico=gui;
		this.mapaLogico= mapaLogico;
		comenzarNiveles();
	}
	
	public void mover(){
		ArrayList<GameObject> entidades = this.mapaLogico.getEntidades();
		ArrayList<GameObject> toCollide;
		for(GameObject e : entidades) {
			if (e.getEsValido()) {
				toCollide= this.mapaLogico.hayEnElRango(e);
			
				if(toCollide.size() == 0) {
					e.accionar();
				}else {
					for(GameObject toCollideElement: toCollide) {
						toCollideElement.Aceptar(e.getVisitor());		
					}
				}
			}
		}
	}
	
	
	public void comenzarNiveles() {
		niveles[0].ejecutarHordas();
	}
	
}
