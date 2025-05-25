package Exampl2;

public class Car extends Vehicle {
	
	Car(){
		
		super();
		System.out.println("I am Car class Constructor");
	}
	
	int maxSpeed  = 18030;
	
	void display() {
		 System.out.println("I am Car but speed of Vehicle "+super.maxSpeed);
	}
   
	public void engine() {
		System.out.println("Car engine started");
	}
	
	public void part() {
		super.part();
		System.out.println("Car Part");
	}
}
