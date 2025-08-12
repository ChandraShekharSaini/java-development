package Inheited;
import java.lang.reflect.*;


@FullStack("I am Annotation")
public class Inheited1 extends Mains {
	
	
	public static void main(String[] args) {
		
		Mains m = new Mains();
		
		m.sound();
		
		
		 boolean hasAnnotation = Inheited1.class.isAnnotationPresent(FullStack.class);
	       System.out.println("Is @ForEveryone present in Subclass? " + hasAnnotation);
		
	
	
	}
}
