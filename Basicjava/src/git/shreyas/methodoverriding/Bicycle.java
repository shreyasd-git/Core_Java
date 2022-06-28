package git.shreyas.methodoverriding;

public class Bicycle {
	
	int gear, speed;
	
	//constructor
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void getgear(int NewValue) {
		gear = NewValue;
	}
	
	public void getapplybrake(int decrement) {
		speed -= decrement;
	}
	
	public void getspeedup(int increment) {
		speed += increment;
	}

}
