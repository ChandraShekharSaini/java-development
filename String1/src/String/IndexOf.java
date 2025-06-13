package String;

public class IndexOf {
	
	
	public static void indexOf() {
		
		String name = "chandra";
		char key  = 'r';
	
		for(int i=0;i<name.length();i++) {
			
			char ch = name.charAt(i);
			
			if(ch == key) {
				System.out.println(i);
				break;
			}
		}
		

	}
   
	
	
	public static void main(String[] args) {
		
		indexOf();
	}
}
