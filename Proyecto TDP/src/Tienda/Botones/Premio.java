package Tienda.Botones;

import Tienda.TiendaLogica;

import java.util.Random;

import GameObject.Objeto;
import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Objetos.Magias.AumentoDeDaño;
import GameObject.Objetos.Magias.Rejuvenecer;
import GameObject.Objetos.ObjetosPreciosos.DonaExplosiva;
import GameObject.Objetos.ObjetosPreciosos.SuperDuff;
public class Premio extends BotonComprar {

	
	public Premio(String s, TiendaLogica tiendaLogica) {
		super(s, tiendaLogica, generarObjeto());
		
	}
	
	
	
	private static Objeto generarObjeto() {
		Random r= new Random();
		Objeto o=new DonaExplosiva(tiendaLogica.getMapaLogico());
		//int n= r.nextInt(4);
//		switch (n) {
//		case 1: o= new AumentoDeDaño(tiendaLogica.getMapaLogico());
//			break;
//		case 2: o= new Rejuvenecer(tiendaLogica.getMapaLogico());
//			break;
//		case 3: o= new DonaExplosiva(tiendaLogica.getMapaLogico());
//			break;
//		case 4: o= new SuperDuff(tiendaLogica.getMapaLogico());
//			break;
//		
//		}
		
		return o;
		
		
	}
	
	

}
