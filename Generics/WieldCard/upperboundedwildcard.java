package WieldCard;

import java.util.*;

abstract class Shape{
	
	abstract void draw();
}

class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("I am Draw Method of Rectangle");
	}
	
}

class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("I am Draw Method of Circle");
		
	}
	
}



public class upperboundedwildcard {
	
public static void ExecuteMethod(List<? extends Shape> list) {
		
	 for(Shape a:list) {
		 a.draw();
	 }
	}

	public static void main(String[] args) {
		
		List<Rectangle>  list1 = new ArrayList<Rectangle>();
		
		list1.add(new Rectangle());
		list1.add(new Rectangle());
		list1.add(new Rectangle());
		
		ExecuteMethod(list1);
		
		List<Circle>  list2 = new ArrayList<Circle>();
		
		list2.add(new Circle());
		list2.add(new Circle());
		
		ExecuteMethod(list2);
	}
	
}
