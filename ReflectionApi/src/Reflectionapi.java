

import java.lang.reflect.*;
public class Reflectionapi {

	
	public static void main(String[] args) {
		
		
	 try {
		 
		 
		Class<?> c  =  Class.forName("Student");
		Object o =  c.getDeclaredConstructor().newInstance();
		Method  m =  c.getMethod("details");
		 m.invoke(o);
		 
		 Student s = new Student();
		 
		  Field field = c.getDeclaredField("name");

	        // Make the private field accessible
	        field.setAccessible(true);

	        // Get the value of the field
	        String value = (String) field.get(s);

	        // Print the value
	        System.out.println("Private name field: " + value);
		
		
		
	} catch (Exception e) {
		
		e.printStackTrace();
		
		e.getMessage();
	}
	}
}
