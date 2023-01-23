package vehicle;

public class Vehicle {
	private int speed;
	private boolean engine;
	
	public Vehicle() {
		speed = 0;
		engine = false;
	}
	
	public void start() {
		System.out.println("Starting The Engine Now!");
		engine = true;
	}
	
	public void stop() {
		System.out.println("Stopping The Engine Now!");
		engine = false;
	}
	
	public void turn(String direction, int degrees) {
		System.out.println("Turning " + direction + " by " + degrees + " degrees");
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int value) {
		speed = value;
		System.out.println("The Speed Of The Car Is " + speed);
	}
	
	public void increaseSpeed(int value) {
		speed += value;
		System.out.println("The Speed Of The Car Has Increased By " + value + " and is at " + speed);
	}
	
	public void decreaseSpeed(int value) {
		speed -= value;
		System.out.println("The Speed Of The Car Has Decreased By " + value + " and is at " + speed);
	}
}
