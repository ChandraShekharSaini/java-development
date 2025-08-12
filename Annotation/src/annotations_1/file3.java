package annotations_1;

import java.util.ArrayList;


public class file3 {
	
	
	
	public static void main(String[] args) {
		

        // If data type is not mentioned in the angle brackets (<>), 
        // IDE may show a warning or error depending on the compiler settings.
        // ArrayList sc = new ArrayList<>(); // This line is commented out
		
		
		//If not mention DataType IDE will give error
	    //ArrayList sc = new ArrayList<>();
		
		 // Suppressing the compiler warning for using raw types (no generic)
		@SuppressWarnings("rawtypes")
		ArrayList sc = new ArrayList<>(); // Using raw type ArrayList without specifying data type
		
		
        // Note:
        // It's recommended to use generics with collections to ensure type safety.
        // For example: ArrayList<String> sc = new ArrayList<>();
	
	}
}
