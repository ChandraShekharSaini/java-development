package String1;


public class String4 {
   
	public static void main(String[] args) {
		
		//In Java, String is immutable.In Java, String is immutable.
		//In Java, String is immutable.In Java, String is immutable.
		
		String s  = "MAMA";	
		s.concat("MAMA");	
		System.out.println(s); //MAMA
		
		
		
	    String m = "JAVA";
	    String n = "MAVA";
	    
	    String str = m.concat(n); // New Object is Created str
	    System.out.println(str);
		
	}
}
