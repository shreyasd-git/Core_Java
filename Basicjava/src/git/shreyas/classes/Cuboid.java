package git.shreyas.classes;

public class Cuboid {

	double length;
	double height;
	double width;
	
	//UseCase - Multiple Constructors
	Cuboid(double length, double height, double width) {
		this.length = length;
		this.height = height;
		this.width = width;
		
	}
	
	//Constructor where 1 parameter(width) is required as Default
	Cuboid(double length, double height) {
		this.length = length;
		this.height = height;
		this.width = 10;
		
	}
	
	Cuboid(double length){
		this.length = length;
		this.height = 10;
		this.width = 10;
	}

	
	//Constructor with all parameters are Default
	Cuboid() {
		this.length = 10;
		this.height = 10;
		this.width = 10;
		
	}
	
	//volume
	double volume(){
		return length*height*width;
	}
	
	//main()
	public static void main(String[] args) {
		
		Cuboid stdCuboid = new Cuboid(10, 20, 12);
		System.out.println("Volume of Standard Cuboid is: " + stdCuboid.volume());
		
		Cuboid defaultparam1Cuboid = new Cuboid(10, 20);
		System.out.println("Volume of 1 Default params Cuboid is: " + defaultparam1Cuboid.volume());
		
		Cuboid defaultparam2Cuboid = new Cuboid(10);
		System.out.println("Volume of 2 Default params Cuboid is: " + defaultparam2Cuboid.volume());
		
		Cuboid simpleCube = new Cuboid(10);
		System.out.println("Volume of Default params Cuboid is: " + simpleCube.volume());
		
	}
}
