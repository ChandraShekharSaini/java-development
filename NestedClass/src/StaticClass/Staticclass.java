package StaticClass;

public class Staticclass {

	static int age = 12;
	int age1 = 78;

	static class mereClass {
		public void sound() {

			System.out.println("I am Method Static Class and my age");

			System.out.println("I can access static member :" + age);
			// System.out.println("I cannot access not static member"+age1);// ❌ Not allowed
			
			//Needs to create Object to access non static method
			Staticclass sc  = new Staticclass();
			System.out.println(sc.age1);

		}
		
		
		public static void eat() {
			System.out.println("I am Eat Method Static");
		}
	}
	
	public static void sound() {
		System.out.println("I  am static");
	}

	public static void main(String[] args) {
		
		// Create  Object of class to access non static method
		Staticclass.mereClass obj = new Staticclass.mereClass();
	    obj.sound();
	    
	    			
		// Need to create Object of class to access static method
		 mereClass.eat();
		
	
	}
}
