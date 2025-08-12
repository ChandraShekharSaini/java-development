package Interface1;

public interface Animal {
	
	
	void sleep();
	
	void eat();

	//From java 8 you can create  static method
	static void staticMethod() {
		System.out.println("I am static Method");
	}
	
	//From java 8 you can create  default method
	default void defaultMethod() {
		System.out.println("I am default Method");
	}
}
