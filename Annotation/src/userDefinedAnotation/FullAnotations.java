package userDefinedAnotation;

@interface Info{
	//If assigning default value it will consider default value
	String languag = "java"; 
	String name();
	String date();
	int  rollNo();
	
}


public class FullAnotations {
	
	//If not mention values then compile time error will come
	@Info(name = "ChandraShekharSaini", date = "2025-06-10",rollNo = 12 ) 
	
	public static void Student1() {
		System.out.println("I am Student One");
	}
  
	public static void main(String[] args) {
		
		FullAnotations sc =new FullAnotations();
		sc.Student1();
	}
}
