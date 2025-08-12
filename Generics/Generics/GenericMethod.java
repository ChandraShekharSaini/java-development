package Generics;

public class GenericMethod {

	public static <T> String Add(T num1 , T num2 , T num3) {
		 
		return num1.toString() +num2.toString() +num3.toString();
				
	}
	
	public static <M> void Array1(M[] matrix){
		  for(int i=0;i<matrix.length;i++) {
			  System.out.println(matrix[i]);
		  }
	}
	
	
	public static void main(String[] args) {
		 
		GenericMethod sc = new GenericMethod();
		
		System.out.println(sc.Add(10, 20, 30));
	
		Integer[] matrix1 = {12,34,5,5,6,66};
		String[] matrix2 = {"Chandra","Shekhar","Saini","Rahul"};
				
		
		  sc.Array1(matrix1);
		  
		  sc.Array1(matrix2);
	}
}
