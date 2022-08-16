package selfSudy;

public class Teacher {
	
	 public int hour = 3;
	 public int minutes= 47;
	 
}
  class aircraft {
	 int passanger;
	 int curuispeed;
	 int fuelCapacity;
	 int fuelBurnRate;
	 
	 
	 void fuelBurnCalculate() {
		 int fuelBurn = fuelCapacity / fuelBurnRate ;
		 System.out.println(" the fuel burn is :" + fuelBurn );
	 }
	 
	  class Shirt {
		 
		 String color;
		 char size;
		 
		  void putOn() {
			 System.out.println("Shirt is on");
		 }
		  void takeOff() {
			 System.out.println("Shirt is off");
		 }
	 }
	 
	 
}