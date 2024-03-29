package VISITOR;




import GameObject.GameObject;
import GameObject.Objeto;
import GameObject.Personaje;
import GameObject.Objetos.ObjetoConVida;
import GameObject.Objetos.ObjetoPrecioso;
import GameObject.Personajes.Enemigo;
import GameObject.Personajes.Torre;
import GameObject.Personajes.Disparos.DisparoLogicoEnemigo;
import GameObject.Personajes.Disparos.DisparoLogicoTorre;


public abstract class Visitor {
	
	protected Personaje mipersonaje;
	protected Objeto miobjeto;
	
	
	public abstract void visitar(Enemigo e);
	
	public  abstract void visitar(Torre t);
	
	public abstract void visitar(ObjetoConVida o);
	
	public abstract void visitar(Objeto o);
	
	public abstract void visitarDisparo(DisparoLogicoTorre e);
	
	public abstract void visitarDisparo(DisparoLogicoEnemigo e);	
	
}
