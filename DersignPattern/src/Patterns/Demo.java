package Patterns;

public class Demo {

	public static void main(String[] args) {
		
		Singleton m1 = Singleton.singleTon();
		
		System.out.println(m1);
		
	    Singleton m2 = Singleton.singleTon();
		
		System.out.println(m2);
		
		
		Singleton m3 = Singleton.singleTon();
			
		System.out.println(m3);
		
		
		//In diff class we We cannot create Object
		// Singleton m1 = Singleton();	
		
		System.out.println(Singleton.singleTon());
		
		
		System.out.println(Singleton.m);
		
		System.out.println(Singleton.singleTon());
	}

	
}
