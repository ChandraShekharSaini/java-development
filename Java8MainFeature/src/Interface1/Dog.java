package Interface1;

public class Dog implements Animal {

	public static void main(String[] arfgs) {
		
		//You can call static method using Interface Name
		Animal.staticMethod();
		

		//You have to make Object of class to access default Mehod
		Dog dog = new Dog();
		
		dog.defaultMethod();
	}
	
	
	public void sleep() {
		//You can call static method using Interface Name
		Animal.staticMethod();
	}
	
    public void eat() {
		
	}
	
}
