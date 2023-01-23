package vehicle;

public class Car extends Vehicle{
	final int topSpeed = 75;
	private int speed;
	private boolean trunk;
	
	
	public Car() {
		trunk = false;
		speed = 0;
	}
	
	public void openTrunk() {
		trunk = true;
		System.out.println("Openning The Trunk Now!");
	}
	
	public void closeTrunk() {
		trunk = false;
		System.out.println("Closing The Trunk Now!");
	}
	
	public void setSpeed(int value) {
		if (value > 75) {
			speed = 75;
			System.out.println("The Speed Cannot Exceed 75!");
			System.out.println("Current Speed Is At 75");
		}
		else {
			speed = value;
			System.out.println("The Current Speed Of A Car Is " + speed);
		}
	}
}
