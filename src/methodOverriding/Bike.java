package methodOverriding;

class Vehicle{
	 public void run(){
		 System.out.println("Vehicle is running");
	 }
}

public class Bike extends Vehicle {
	
	public void run(){
		System.out.println("Bike is running");
	}
	
	public static void main(String[] args) {
		Bike B1 = new Bike();
		B1.run();
	}

}
