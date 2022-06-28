package git.shreyas.methodoverriding;

public class Mountainbike extends Bicycle {
	
	int seatheight;
	
	//constructor
	public Mountainbike(int gear, int speed, int seatheight) {
		super(gear, speed);
		this.seatheight = seatheight;
		
		
	}
	
	public void getseatheight(int heightval) {
		seatheight = heightval;
	}
	
	@Override
	public void getapplybrake(int decrement) {
		speed -= decrement-5;
	}
	
	@Override
	public void getspeedup(int increment) {
		speed += increment+10;
	}
	

	
}
