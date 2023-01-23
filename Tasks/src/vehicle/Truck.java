package vehicle;

public class Truck extends Vehicle{
	
	private boolean tailgate;
	
	public Truck() {
		tailgate = false;
	}
	
	public void openTailgate() {
		tailgate = true;
		System.out.println("Openning The Tailgate");
	}
	
	public void closeTailgate() {
		tailgate = false;
		System.out.println("Closing The Tailgate");
	}
}
