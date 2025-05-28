package Exampl1;

public class Sample {
	
	 public static int main() {
			
			System.out.println("Overloading Main Method");
			return 90;
	 }
	 
	 public static String main() {
			
			System.out.println("Overloading Main Method");
			
			return "chandra";
	 }
	
	
     public static void main() {
		
		System.out.println("Overloading Main Method");
	}


     public static void main(int a) {
	
    	 System.out.println("Overloading Main Method "+a);
	
    }
     

     public static void main(int a , String name) {
    	 System.out.println(a + name);
     }
	
	
	public static void main(String[] args) {
				
		main();
		main(12);
		main(23,"Chandra");
	}
}
