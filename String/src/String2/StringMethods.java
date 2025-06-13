package String2;

public class StringMethods {
  
	public static void main(String[] args) {
		
		String s1 = "chandra shekar saini";
		String s2 = "CHANDRA SEKHAR SAINI";
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
	
		System.out.println("-----------charAt()--------------------");
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		
		System.out.println("-----------concat()--------------------");
		System.out.println(s1.concat(s2));
		System.out.println("JAVA ".concat("PROGRAMING"));
		
		System.out.println("-----------indexOf()--------------------");
		System.out.println(s1.indexOf("sh"));
		
		//Check From last
		System.out.println("-----------lastIndexOf()--------------------");
		System.out.println(s1.lastIndexOf('i'));
		System.out.println(s1.lastIndexOf('n'));
		
		System.out.println("-----------startWith()--------------------");
		//The startsWith() method checks whether a string starts with the specified character(s).
		System.out.println(s1.startsWith("ch"));
		
		System.out.println("-----------indexOf()--------------------");
		String myStr = "Hello planet earth, you are a great planet.";
		System.out.println(myStr.indexOf("o",5));
	    
	
		System.out.println("-----------isEmpt()--------------------");
		System.out.println(s1.isEmpty()); //true
		System.out.println("".length()); //if length is 0 , string is Empty
		System.out.println("".isEmpty()); //false
	
		
		System.out.println("-----------isEmpt()--------------------");
		System.out.println(" ".length()); //lenghth 1
		System.out.println("  ".isEmpty());
		
		System.out.println("-----------isBlank()--------------------");
		System.out.println(s1.isBlank());
		
	}
}
