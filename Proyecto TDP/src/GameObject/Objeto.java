package GameObject;

import VISITOR.Visitor;

public class Objeto extends GameObject {

	
	

	public GameObject clone() {
		return new Objeto();
	}

	@Override
	public void Aceptar(Visitor visitante) {
		// TODO Auto-generated method stub
		
	}
}
