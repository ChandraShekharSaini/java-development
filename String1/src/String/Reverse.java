package String;

public class Reverse {

	
	
	public static void main(String[] args) {
		
		String name = "kmkj";
		
		String str = "";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			str+=name.charAt(i);
		}
		
		System.out.println(str);
	}
}
