
package Hordas;

import Nivel.Nivel;

import java.awt.Point;
import java.util.Random;

import GameObject.GameObject;
import GameObject.Objetos.ObjetosConVida.SuperDuff;
import GameObject.Personajes.Enemigos.*;
import GameObject.Personajes.Enemigos.EnemigosCuerpo.Apu;
import GameObject.Personajes.Enemigos.EnemigosCuerpo.Barney;
import GameObject.Personajes.Enemigos.EnemigosCuerpo.BumbleeMan;
import GameObject.Personajes.Enemigos.EnemigosDisparan.Chief;
import GameObject.Personajes.Enemigos.EnemigosDisparan.Moe;
import GameObject.Personajes.Enemigos.EnemigosDisparan.MrBurns;
import Mapa.MapaLogico;

public class Horda {
	protected Nivel nivel;
	protected MapaLogico mapaLogico;
	protected int cantEnemigos;
	
	
	
	public Horda (Nivel nivel, MapaLogico mapaL, int cantEnemigos) {
		this.mapaLogico=mapaL;
		this.nivel=nivel;
		this.cantEnemigos=cantEnemigos;
		
	}
	
	public GameObject crearEnemigo() {
		int y=0;
		int enemigo;
		GameObject g=  new Apu(mapaLogico);
		Point p;
		Random r = new Random();
		
		if (cantEnemigos!=0) {
			enemigo= r.nextInt(6)+1;
			
			
			switch(enemigo) {
			case 1: g= new Apu(mapaLogico);
				break;
			case 2: g= new Barney(mapaLogico);
				break;
			case 3: g= new BumbleeMan(mapaLogico);
				break;
			case 4: g= new Chief(mapaLogico);
				break;
			case 5: g= new Moe(mapaLogico);
				break;
			case 6: g= new MrBurns(mapaLogico);
				break;
			}
			
			y=r.nextInt(700-250+1)+250;
			p= new Point(1080, (y/100)*100);

			g.setPosicion(p);
			
			cantEnemigos--;			
		}

		
		return g;
		
	}
	
	public int getCantEnemigos() {
		return cantEnemigos;
	}

	public boolean finalizarHorda() {
		return cantEnemigos==0;	//cuando es 0 retorna falso y corta el while
	}
}

