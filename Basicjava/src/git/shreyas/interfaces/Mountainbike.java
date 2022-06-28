package git.shreyas.interfaces;

//Multiple-Inheritance can be achieved by using Interfaces (diamond problem solved)
//Child class can have only 1 concrete/parent class (extends) and any number
//of interfaces (implements)
public class Mountainbike extends Twowheeler implements Bicycle, Vehicle {
	
	int seatHeight;
	int speed;
	int gear;
	
	public Mountainbike(int seatHeight, int startSpeed, int startGear) {
		this.seatHeight = seatHeight;
		this.gear = startGear;
		this.speed = startSpeed;
	}

	@Override
	public void applyBrake(int decrement) {
		speed = speed - decrement;
		
	}

	@Override
	public void speedUp(int increment) {
		speed = speed + increment;
		
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public int getSpeed() {
		return speed;
	}

	public int getGear() {
		return gear;
	}

	
	//adding implementation/body of Vehicle interface's method - drive
	@Override
	public void drive() {
		System.out.println("Mountain Bike can be Driven");
		
	}
	
	

}
