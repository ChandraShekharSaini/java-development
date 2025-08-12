package userDefinedAnotation;

@interface fullStack{
	String value();
}

public class SingleValueAnnotations {
   
	@fullStack("java")
	public static void JavaStack() {
		System.out.println("I am Java Stack");
	}
	
	@fullStack(value = "js")
	public static void MernStack() {
		System.out.println("I am Mern Stack");
	}
	
	
	public static void main(String[] args) {
		
		SingleValueAnnotations sc = new SingleValueAnnotations();
		sc.JavaStack();
		sc.MernStack();
		
		
	}
}
