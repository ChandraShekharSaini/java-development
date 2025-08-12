package userDefinedAnotation;


// MarkerAnnotations //MarkerAnnotations //MarkerAnnotations


@interface ImportantMethod{}
@interface RoundMethod{}

public class MarkerAnnotations {
	
	@ImportantMethod
	public void Important() {
		System.out.println("I am Important Method");
	}
	
	@RoundMethod
	public void RandMethod() {
		System.out.println("I am Round Method");
	}

	public static void main(String[] args) {
		
		MarkerAnnotations sc = new MarkerAnnotations();
		sc.Important();
		sc.RandMethod();
	 
	}
	
}


