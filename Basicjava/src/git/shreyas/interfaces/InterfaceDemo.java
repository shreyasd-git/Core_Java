package git.shreyas.interfaces;

public class InterfaceDemo {
	public static void main(String[] args) {
		
		Mountainbike mountbike = new Mountainbike(5, 10, 2);
		
		System.out.println("Seat Height is: " + mountbike.getSeatHeight());
		System.out.println("Start Gear is: " + mountbike.getGear());
		System.out.println("Start Speed is: " + mountbike.getSpeed());
		
		mountbike.applyBrake(3);
		System.out.println("Speed after applying Brake is: " + mountbike.getSpeed());
		
		mountbike.speedUp(30);
		System.out.println("Speed after acceleration is: " + mountbike.getSpeed());
		
		
		//below two methods are for multiple inheritance Demo - solved using Interfaces
		//method of the only 1 concrete/parent class of MountainBike class
		mountbike.drivedifficulty();
		
		//method of Vehicle interface (2nd/multiple implemented interface
		mountbike.drive();
	}

}
