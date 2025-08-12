package InnerClass;

public class OuterClass {
	
	 String nameString = "ChandraShekharSaini";
	 static String nameStr = "RahulSingh";
	  

	 class InnnerClass {
		
		 //1. Non-Static method cannot be declard in inner(non-static class) class
//		 public static void sound() {
//			 System.out.println("I am static method");
//		 }
		 
		 public  void eat() {
			 System.out.println(nameStr);
			 System.out.println(nameString);
			 System.out.println("I a Non-Static method");
		 }
		 
	}
	 
	 
	 public void data() {
		System.out.println("I am Method");
	}
	 
	 
   public static void main(String[] args) {
	   
	   // Step 1: Outer class object
	   OuterClass outer = new OuterClass();
	   
	   // Step 2: Inner class object using outer
	   OuterClass.InnnerClass innerClass = outer.new InnnerClass();
	   
	   // Step 3: Call method
	   innerClass.eat();
	   
	   	   
   }
}
