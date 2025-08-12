package Patterns;

public class Singleton {
	
	
	static Singleton m = null;
	
	
	// static Singleton m = new Singleton();
	
	
	private Singleton() {
		
	}
	
	public static  Singleton singleTon() {
		
		if(m==null) {
			m = new Singleton();
		}
		
		return m;
	}
	
	

	public static void main(String[] args) {
		
		//Singleton m =new Singleton();
		
		//Singleton m2 = m.singleTon();
		
		
		//System.out.println(m);
		
		//System.out.println(m2);
		
		
		System.out.println("---------------------Same-Address()----------------------");
		
		Singleton mb = Singleton.singleTon();
		
		System.out.println(m);
		System.out.println(mb);
		
		System.out.println("---------------------Diff-Address()----------------------");
		
		Singleton m3 = new Singleton();
		m3.singleTon();
		System.out.println(m3);
	
	}
}
