package String1;

public class String2 {
  
	
	public static void main(String[] args) {
		
		//Compare Using == operator
		
		String s1 = new String("Chandra Sekhar Saini");
		String s2 = new String("Chandra Sekhar Saini");
		System.out.println(s1==s2);
		
		String str1 = "Chandra Sekhar Saini";
		String str2 =  "Chandra Sekhar Saini";
		System.out.println(str1 == str2);
		
		System.out.println(s1==s2);
		
		str1 = s1;
		
		System.out.println(str1==s1);
		
		
		//Compare Using equals operator(checks only value)
		
		String r1 = "Baba";
		String r2 = "Baba";
		String r3 = "Baba";
		System.out.println(r1.equals(r2));
		
		System.out.println(r1.equals(r3));
		
		
		//Compare Using equals operator(checks only value)
		
		String b1 = "Kaju";
		String b2 = "Baju";
		
		System.out.println(b1.compareTo(b2));
		
		
		//In Java, equalsIgnoreCase() method of the String class compares two strings irrespective of the case (lower or upper) of the string.
		 String n1 = "GeeKS FOr gEEks";
		 String n2 = "geeKs foR gEEKs";
		 String n3 =  "meeKs foR gEEKs";
		 
		System.out.println(n1.equalsIgnoreCase(n2)); //true 
		System.out.println(n2.equalsIgnoreCase(n3)); //false
		 
	}
}
