package LocalClass;

public class OuterClass {

	
	public static void localMethod() {
		
		int age = 13;
		String name = "Chandra Shehar Saini";
		
		
		class localClass{
			
			public  void Data() {
				
				System.out.println(age);
				System.out.print("I am Local method");
				System.out.println(name);
			}
		}
	
		
		localClass sc  = new localClass();
		sc.Data();
	}
	
	
	public static void main(String[] args) {
		
	  OuterClass obj = new OuterClass();
	  obj.localMethod();
	  
	  
	}
}
