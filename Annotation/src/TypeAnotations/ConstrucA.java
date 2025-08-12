package TypeAnotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.CONSTRUCTOR)
@interface MeraMethod{
	
}


public class  ConstrucA {
	
	@MeraMethod()
	public  ConstrucA() {
		System.out.println("I am Contructor");
	}
	
	
	//Will Give compile time error if used annotation @MeraMethod
	//@MeraMethod()
	public static void sound() {
		System.out.println("I am Method");
	}

	//Will Give compile time error if used annotation @MeraMethod
	//@MeraMethod()
	public static void eat() {
		System.out.println("I am Method");
	}

	//Will Give compile time error if used annotation @MeraMethod
	//@MeraMethod
	public void data() {
		System.out.println("I am Method");
	}
	

   //Will Give compile time error if used annotation @MeraMethod
   // @MeraMethod
	int age = 12;

	public static void main() {
		
	}

}
