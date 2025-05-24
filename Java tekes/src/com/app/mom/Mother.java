package com.app.mom;

import com.app.papa.Father;

public class Mother extends Father {

	public static void main(String[] args) {
//		
//		Father sc  = new Father();
//		
//		sc.car();
		
		Mother sc1 = new Mother();
		sc1.cycle();
		sc1.car();  //now can access protected

	
	}
}
