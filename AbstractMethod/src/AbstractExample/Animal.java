package AbstractExample;

public class Animal extends Dog {
	   
	   //cannot make object of abstract class
	   // Dog dog =  new Dog();

	@Override
	public void Cloths() {
		System.out.println("I am Cloths");
		
	}

	@Override
	public void Food() {
	
		System.out.println("I am Food");
		
	}

	public void Food(int a  , int b) {
		
		System.out.println("I am Food:" + (a + b));
		
	}
	
	
}


