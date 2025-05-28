package Example1;

public class Overloading {
    
	public static void sound(int a) {
		
		System.out.println(a);
	}
	
	public static void sound(int a , double num) {
		System.out.println(a + num);
	}
	
	
	public static void sound(int a , String str) {
		System.out.println(a + str);
	}
	
	public static void sound(int a , int b , int c) {
		System.out.println(a + b + c);
	}
	
	//error
//	public static void sound(int num , int mum , int num) {
//		System.out.println();//	}
	
	public static void sound(String nam1 , String nam2,String nam3) {
		System.out.println(nam1 + nam2 + nam3);
	}
	
	
	
	public void sound() {
		System.out.println("I am sound");
	}
	 
	
	
	public static void main(String[] args) {
		
		Overloading  o = new Overloading(); 
		o.sound();
		
		sound(78);
		
		sound(12,45);
		
		sound(12,"Chandra");
		
		sound(12,34,56);
		
		sound("Mr" , "Shekhar" , "Saini");
	}
}
