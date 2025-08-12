package TypeAnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@interface MeraMethod12{
	
}


public class MethodA {
	
	@MeraMethod12
	public static void sound() {
		System.out.println("I am Method");
	}
	
	@MeraMethod12
	public static void eat() {
		System.out.println("I am Method");
	}
	
	@MeraMethod12
	public void data() {
		System.out.println("I am Method");
	}
	

//Will Give compile time error if used annotation @MeraMethod
// @MeraMethod
	int age = 12;

	public static void main() {
		
	}

}
