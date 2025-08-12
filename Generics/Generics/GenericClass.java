package Generics;

//Generic Class

public class GenericClass<T> {
	
	T num1;
	
	public T getVal(T num1) {
		
		this.num1 = num1;
		return num1;
	}
	
	
	public static void main(String[] args) {
		
		GenericClass<Integer> obj = new GenericClass<Integer>();
		
		System.out.println(obj.num1);
		System.out.println(obj.getVal(90));
		
		
	}
}
