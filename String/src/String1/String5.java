package String1;

public class String5 {
  
	 public static void main(String[] args) {
		
		 
		 String s1  = "A";
		 String s2 = "A";
		 
		 System.out.println(s1.compareTo(s2)); //0
		 
		 String s3 = "B";
		 
		 System.out.println(s2.compareTo(s3)); //-v1 (s1 < s3)
		 
		 String s4 = "C";
		 
		 String m1 = "Bnmm";
		 String m3 = "Cnmm";
		 
		 
		 System.out.println(m1.compareTo(s3)); // +ve (m1 > m3)
		 
		 
	 }
}
