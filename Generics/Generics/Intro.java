package Generics;

import java.util.ArrayList;

public class Intro {

	public static void main(String[] args) {
		
	// 1) Type-safety:
		ArrayList<Integer> sc = new ArrayList<Integer>();
		sc.add(12);
		sc.add(34);
		sc.add(56);
	
	// 2) Type casting is not required: 
		
		Object o = sc.get(0);
		int n = (int) (o);
		System.out.println(n);
		
    // 3) Compile-Time Checking
		sc.add("String); //Compile Time Error
				
	}
}
