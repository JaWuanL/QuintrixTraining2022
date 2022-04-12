
public class Car {
	public String engine;
	private String odometer;
	public String LargeEngine;

	public void LargeEngine(String engine) {
		this.engine = engine;
	}	
	public void startEngine() {
		  Car newCar = new Car();
		  newCar.startEngine();
		  System.out.println("Engine Started");
	}
	public String getOdometer() {
		return odometer;
	}

}
