package Exampl2;

public class Bike extends Vehicle{
	
	 Bike(){
		 
		 super();
		 System.out.println("I am Bike class Constructor");
	 }
	
	int maxSpeed = 4500;
	
	 void display() {
		 System.out.println("I am Bike but speed of Vehicle "+super.maxSpeed);
	 }
	 
	 
  
	public  void engine() {
		System.out.println("Bike engine started");
	}
	
	
	public  void part() {
		super.part();
		System.out.println("Bike Part");
	}
	
	
}
