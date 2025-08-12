package TypeAnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.ANNOTATION_TYPE)
@interface Info{
	String message();
	
}


@Info(message = "I am Annotation Type")
@interface MetaData{
	
}


public class AnnnotationTypeA {

@MetaData	
public static void sound(){
		System.out.println("I am Method");
}
	
	public static void main(String[] args) {
		
		
	}
}
