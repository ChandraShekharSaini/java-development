package MultipleLevel;

public class Child extends Parent{

	  
		public void sound() {
			System.out.println("I am Sound Methhod");
		}
		
		
		public static void main(String[] args) {
			Child c1 = new Child();
			c1.sound(); //Child Method
			c1.BikeData(); //Parent Method
			c1.DataGrand(); //GradFtaher Method
			
	       System.out.println();		
			Parent p1 = new Parent();
			p1.BikeData();
			p1.DataGrand();
		}
}
