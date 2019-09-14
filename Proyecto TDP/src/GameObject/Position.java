package GameObject;

import java.awt.Point;

public class Position {
	private int x, y;
	
	public Position (int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void setPosition(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Point getPosition() {
		return new Point(x,y);
	}
	
	
}
