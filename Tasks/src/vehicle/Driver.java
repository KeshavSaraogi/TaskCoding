package vehicle;

public class Driver {

	public static void main(String[] args) {
		Vehicle vh = new Vehicle();
		
		vh.start();
		vh.setSpeed(30);
		vh.turn("Left", 30);
		System.out.println(vh.getSpeed());
		vh.increaseSpeed(100);
		vh.decreaseSpeed(40);
		vh.stop();
		
		System.out.println("##########");
		
		Car car = new Car();
		car.start();
		car.setSpeed(80);
		car.openTrunk();
		
		System.out.println("##########");
		
		Truck truck = new Truck();
		truck.openTailgate();
		
	}
}
