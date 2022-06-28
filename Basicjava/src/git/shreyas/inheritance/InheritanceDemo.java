package git.shreyas.inheritance;

public class InheritanceDemo {
	public static void main(String[] args) {
		
		MountainBike mountainbike = new MountainBike(15, 20, 1);
		System.out.println("Gear is: " + mountainbike.gear);
		System.out.println("Speed is :" + mountainbike.speed);
		System.out.println("Seat Height is :" + mountainbike.seatHeight);
		
		mountainbike.applyBrake(2);
		System.out.println("Speed after applying Brake is: " + mountainbike.speed);
		
		
	}

}
