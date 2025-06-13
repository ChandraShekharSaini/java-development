package String;

public class UpperClassImplementation {
	
	public static String  toUpperCase(String small) {
		 

String large = "";

for(int i=0;i<small.length();i++) {
	
	
	char c = small.charAt(i);
	
	if(c>=97 && c<=122) {
		
		large+= (char) (c-32);
		
	}else {
		large+=c;
	}
   }

     return large;
	}
	
	
   
	public static void main(String[] args) {

		System.out.println(toUpperCase("javaAbnn"));
;		
	
	}
}
