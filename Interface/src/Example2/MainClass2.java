package Example2;

public class MainClass2 {
  
 static	Animal sc;
 
 public static void access() {
	 sc.eat();
	 sc.sleep();
	 sc.sound();
 }
 
 
 public static void method(Animal a) {
	 a.eat();
	 a.sleep();
	 a.sound();
 }
	
	
	
	public static void main(String[] args) {
		
//	  access(); //will give NullPonterEcception
		
		method(new Cat());
		System.out.println();
		method(new Snake());
		  
	  
	}
}
