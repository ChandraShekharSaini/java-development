package String1;

public class String3 {
    
	public static void main(String[] args) {
		
		String s1  = "JAVA"; //SP
		String s2  = "JAVA"; //SP
		
        String str1  = "JAVA" + "JAVA";
		
		String str = "JAVA" + s2; //SP
		
		System.out.println(str == s1);
		
		
		System.out.println(str1 == s1);
		
		
		String j1= "JAVA";
		String j2 = "MAVA";
		
		String mtr1 = j1.concat(j2);
		String mtr2  = j1.concat(j2);
		System.out.println(mtr1 == mtr2);
		
		
		String jkr1 = "chandra".concat("chandra"); //heap
		String jkr2 = "chandra".concat("chandra"); //heap
		
 		
	}
}
