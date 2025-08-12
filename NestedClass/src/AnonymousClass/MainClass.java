package AnonymousClass;

interface Anonyms {
	void data();

	int sound();
}


//1. Now no neeed to do this
//class Mobile implements Anonyms{
//
//	@Override
//	public void data() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public int sound() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	
//}

public class MainClass {

	public static void main(String[] args) {

	  //2. Use this method for immediate implementation of method
		Anonyms sc = new Anonyms() {

			@Override
			public void data() {
				System.out.print("I am Implemented Class");

			}

			@Override
			public int sound() {
				int a = 90;
				int b = 89;
				return a + b;
			}

		};
		
		sc.data();
	}
}
