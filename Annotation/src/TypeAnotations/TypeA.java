
package TypeAnotations;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;



@Target(ElementType.TYPE)
@interface FullStack{
	String value();
}

@FullStack("This is only used for class , interfrace , enumeration and enums")
public class TypeA {
	
//Will Give compile time error if used annotation FullStack
//	@FullStack
	public TypeA() {
		System.out.println("I am Contructor");
	}
	
//Will Give compile time error if used FullStack annotation FullStack
//	@FullStack
	public static void Method() {
		System.out.println("I am Method");
	}
	
//Will Give compile time error if used annotation FullStack
//	@FullStack
	int nm = 12;
	
	public static void main(String[] args) {
	 

		Method();
	}
}
