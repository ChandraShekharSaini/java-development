
public class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("I am boo boo");
		
	}

	@Override
	public void legs() {
		System.out.println("4 legs");
		
	}
	
	public static void main(String[] args) {
		
		 Dog d = new Dog();
		 
		 d.sound();
		 d.legs();
		 
		// d.data = 90;
		 
		 System.out.println(d.data);
		 
	}

}
