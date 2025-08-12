package TypeAnotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


//A local variable is a variable that is declared within a specific block of code, 
//such as a function or a loop, and its scope is limited to that block
@Target(ElementType.LOCAL_VARIABLE)
@interface MeraLocalVar{
	
}


public class  LocalVarA {
	
	public static void Sum() {
		
		@MeraLocalVar
		int a = 12;
		
		@MeraLocalVar
		int b = 12;
		
		
		System.out.println("I am Sum:");
	}
	
	//Will Give compile time error if used annotation @MeraMethod
	//@MeraLocalVar
	public  LocalVarA() {
		System.out.println("I am Contructor");
	}
	
	
	//Will Give compile time error if used annotation @MeraMethod
	//@MeraLocalVar
	public static void sound() {
		System.out.println("I am Method");
	}


	//Will Give compile time error if used annotation @MeraMethod
	//@MeraLocalVar
	public void data() {
		System.out.println("I am Method");
	}
	

   //Will Give compile time error if used annotation @MeraMethod
   //@MeraLocalVar
	int age = 12;

	public static void main() {
		
	}

}
