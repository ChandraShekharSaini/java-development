
public class MinClass {
	
	
	//also can make referance variable of integace
	Animal animal=null;
	
	
	public MinClass(Animal animal) {
		this.animal = animal;
	}
	
	
	public void display( ) {
		 animal.sound();
		 animal.legs();
	}
   
	public static void main(String[] args) {
		 Cat c = new Cat();
		 Dog d = new Dog();
		 
		 MinClass main = new MinClass(c);
		 main.display();
		 
		 MinClass main2 = new MinClass(d);
		 main2.display();
		 
	}
}
