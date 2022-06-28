package git.shreyas.abstraction;

public abstract class GraphicObject {
	int x, y;
	
	void moveTo(int newX, int newY) {
		System.out.println("move to x: " +x+ " and y: " +y);
	}
	
	
	//abstract methods
	abstract void draw();
	abstract void resize();

}
