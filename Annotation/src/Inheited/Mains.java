package Inheited;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited 
@Retention(RetentionPolicy.RUNTIME)
@interface FullStack{
	String value();
}


@FullStack("I Parent Class, Child Class will not be able to access me until uses @Inhherited annotation")
class Mains{
	
	public void  sound() {
		System.out.println("I am Data");
	}
}
