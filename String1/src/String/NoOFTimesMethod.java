package String;

public class NoOFTimesMethod {
   
	
	public static void main(String[] args) {
		
		String name = "JAVALen"; 
		char ch = 'A';
		int count=0;
		
		for(int i=0;i<name.length();i++) {
			
			if(name.charAt(i)==ch) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
