package String;
import java.util.Scanner;

public class StartWithMethod {
	
	
	public static boolean startsWith(String str , String substr) {
		
		int count=0;
		
		for(int i=0;i<substr.length();i++) {
			if(str.charAt(i) == substr.charAt(i)) {
				count++;
			}
		}
		
		if(count == substr.length()) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String str = sc.nextLine();
		System.out.println("Ente Sub String:");
		String substr = sc.nextLine();
		
		System.out.println(startsWith(str , substr));
		
	}
}
