package Tienda.Botones;

import Tienda.TiendaLogica;

import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;

import GameObject.Objeto;
import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Objetos.Magias.AumentoDeDaņo;
import GameObject.Objetos.Magias.Rejuvenecer;
import GameObject.Objetos.ObjetosPreciosos.Bomba;
import GameObject.Objetos.ObjetosPreciosos.Fuego;
import GameObject.Objetos.ObjetosPreciosos.SuperDuff;
import State.Comprando;
import State.Preciosos;
public class Premio extends Boton {

	
	public Premio(String s, TiendaLogica tiendaLogica) {

		super(tiendaLogica, s);

		
	
	
	
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
//				new SuperDuff(tiendaLogica.getMapaLogico());
				generarObjeto();
			}
		});	
	
	}
	
	
	private static void generarObjeto() {
		Random r= new Random();
		ObjetoPrecioso o = new SuperDuff(tiendaLogica.getMapaLogico());
		
//		int n= r.nextInt(3);
//		System.out.println(n);
//		switch (n) {
//		case 0: o= new Bomba(tiendaLogica.getMapaLogico());
//			break;
//		case 1: o= new Fuego(tiendaLogica.getMapaLogico());
//			break;
//		case 2: o= new SuperDuff(tiendaLogica.getMapaLogico());
//			break;
//		
//		}

		tiendaLogica.getJuego().cambiarEstado(new Preciosos(tiendaLogica.getJuego(), o));
		
		

		
	}
	
	

}
