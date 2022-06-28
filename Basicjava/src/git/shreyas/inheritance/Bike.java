package git.shreyas.inheritance;

public class Bike {
	
		protected int speed;
		protected int gear;
		
		public Bike(int strtspeed, int strtgear) {
			this.speed = strtspeed;
			this.gear = strtgear;
		}
		
		public void getgear(int newValue) {
			gear = newValue;
		}
		
		public void applyBrake(int decrement) {
			speed = speed - decrement;
		}
		
		public void speedUp(int increment) {
			speed = speed + increment;
		}
		

}
