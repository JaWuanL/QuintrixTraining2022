import org.testng.annotations.Test;

public class CarTests {
  public String model;

@Test
  public void canBuildCar() {
	  
	  Car newCar = new Car();
	  newCar.startEngine();
	  System.out.println("Engine Started");	  	  
  }
  
  public CarTests(String model) {
	  this.model = "Corvette";
	  
  }
  
  
  
}
