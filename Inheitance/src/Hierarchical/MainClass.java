package Hierarchical;

public class MainClass {
     
	public static void main(String[] args) {
		
		Kotak k1 =  new Kotak();
		k1.bankLoan(); //Parent Class
		k1.KotakLoan(); //Child Class
		
		System.out.println();
		
		
		SBI s1 =  new SBI();
		s1.bankLoan(); //Parent Class
		s1.SbiLoan(); //Child Class
		
		
	}
}
