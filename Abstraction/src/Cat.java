
public class Cat implements Animal{

	@Override
	public void sound() {
	System.out.println("I am meo meo");
		
	}

	@Override
	public void legs() {
		System.out.println("4 legs");
		
	}
	
	
	public static void main(String[] args) {
		
		 Cat c = new Cat();
		 
		 c.sound();
		 c.legs();
		 
		// c.data = 90;
		 
		 System.out.println(c.data);
		 
	}

}
