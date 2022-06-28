package git.shreyas.inheritance;

public class MountainBike extends Bike{
	
	public int seatHeight;

	public MountainBike(int startHeight, int strtspeed, int strtgear) {
		super(strtspeed, strtgear);
		this.seatHeight = startHeight;
		
	}
	
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}

}
