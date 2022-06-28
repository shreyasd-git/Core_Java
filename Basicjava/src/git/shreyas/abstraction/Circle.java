package git.shreyas.abstraction;

public class Circle extends GraphicObject{

	@Override
	void draw() {
		System.out.println("Drawing a Circle");
		
	}

	@Override
	void resize() {
		System.out.println("Resizing a Circle");
		
	}

}
