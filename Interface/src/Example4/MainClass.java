package Example4;

public class MainClass {

	 public static void main(String[] args) {
		 
			Kotak sc = new Kotak();
			sc.loans();
			System.out.println(sc.getLoan());
			
			System.out.println();
			
			SBI sb = new SBI();
			System.out.println(sb.getLoan());
			
            System.out.println();
			
			Kotak sb1 = new Kotak();
			sb1.loans();
			sb1.getLoan();
	 }
}
