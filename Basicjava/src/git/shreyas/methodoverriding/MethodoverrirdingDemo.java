package git.shreyas.methodoverriding;

public class MethodoverrirdingDemo {
	
	public static void main(String[] srgs) {
		Bicycle bike = new Bicycle(2, 25);
		System.out.println("Bike is in Gear: " +bike.gear);
		System.out.println("Speed of Bike: " +bike.speed);
		bike.getapplybrake(5);
		System.out.println("Speed of Bike after applying Brake: " + bike.speed);
		
		bike.getspeedup(10);
		System.out.println("Speed of Bike after acceleration: " + bike.speed);
		
		
		//dynamic 
		Bicycle mountainbike = new Mountainbike(5, 4, 50);
		mountainbike.getapplybrake(10);
		System.out.println("Speed of MountainBike after apply brake:" + mountainbike.speed);
		
		mountainbike.getspeedup(12);
		System.out.println("Speed of MountainBike after accelerate:" + mountainbike.speed);
		
	}

}
