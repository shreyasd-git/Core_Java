package git.shreyas.abstraction;

public class AbstractionDemo {
	
	public static void main(String[] args) {
		
		//calling GraphicObject's method using subclass - to hide parent_class(GraphicObject) properties/methods
		GraphicObject circle = new Circle();
		circle.draw();
		circle.resize();
		
		GraphicObject rectangle = new Rectangle();
		rectangle.draw();
		rectangle.resize();
		
	}

}
