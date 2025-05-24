
//implementation class bec it provide implementation for Aimal class Method
// make Cat class anstract , if not providing implementation for methods of Aimal Class
public  class Cat implements Animal{

	@Override
	public void sound() {
	System.out.println("Meow Meow....");
		
	}

	@Override
	public void eat() {
		System.out.println("Eat Rat Daily");
		
	}

  public static void main(String[] args) {
	 Cat c1 = new Cat();
	 c1.sound();
	 c1.eat();
	 
	 System.out.println(Animal.num);
	 
	 System.out.println(c1.num);
	 
	 //c1.num = 900; cannot update
  }	


}
