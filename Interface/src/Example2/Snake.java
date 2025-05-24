package Example2;

public class Snake implements Animal {

	@Override
	public void sound() {
		System.out.println("Shi Shi...........");
		
	}

	@Override
	public void eat() {
		System.out.println("I eat Frog");
		
	}

	@Override
	public void sleep() {
		System.out.println("Two hour daily");
		
	}

}
