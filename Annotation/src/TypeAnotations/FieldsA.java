package TypeAnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//Used for instance varibale

@Target(ElementType.FIELD)
@interface MeraVar{
	
}


public class FieldsA {
 
@MeraVar
int age = 12;

@MeraVar
String name = "Chandra";


//Will Give compile time error if used annotation @MeraVar
//@MeraVar
public void data() {
	//Will Give compile time error if used annotation @MeraVar
	//@MeraVar
	String data = "Iam12";
	System.out.println("I am Method");
}



public static void main() {
	
}



}
