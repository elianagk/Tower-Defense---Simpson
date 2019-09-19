package GameObject;

import GameObjectGrafico.GameObjectGrafico;

public abstract class GameObject {

	protected int vida;
	protected GameObjectGrafico miobjetografico;
	protected Position position;
	
	public Position getPosition() {
		return position;
	}
	
	
	
}
