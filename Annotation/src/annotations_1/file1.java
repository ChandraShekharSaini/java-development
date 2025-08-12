package annotations_1;

import java.util.ArrayList;

//Override //Override//Override//Override
//Override//Override//Override//Override

class Vehicle{
	public void showDataAndTime() {
		
		System.out.println("7:30PM");
	}
}

public class file1 extends Vehicle {
	
	@Override
     public void showDataAndTime() {
		
		System.out.println("8:00PM");
	}

	
	public static void main(String[] args) {
		
		file1  f1 = new file1();
		f1.showDataAndTime();
	}
}
