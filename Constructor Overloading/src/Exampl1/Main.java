package Exampl1;

public class Main {
  
    public Main(){
     
	    this(89);
	
		System.out.println("I am  Constructor....");		
	
	}
	
	public Main(int a){
		
		this("Chandra" , "Shekhar");
		System.out.println("I am  Constructor 2"+a);
	}
	
	public Main(String name1 , String name2){
		this(90,89);
	
		System.out.println("I am  Constructor 3 with name "+name1+name2);
		
	
	}
	
	public Main(int a , int b){
	
		System.out.println("I am  Constructor 4 "+(a+b));
		
	}
	
	
	public static void main(String[] args) {
		 
		  new Main();
	}
}
