package WieldCard;

import java.util.*;

public class Unbounded_Wildcard {

	
	//  Unbounded Wildcard // Unbounded Wildcard
	public static void Display(List<?> list) {
		
		for(Object o:list) {
			System.out.println(o);
		}
	}
	

	

	
	public static void main(String[] args) {
		
	List<Integer> l1 = Arrays.asList(1, 2, 3, 3);
	

	
	Display(l1);
	 
	List<String> l2 = Arrays.asList("chandra","shekhar","saini");
	
	Display(l2);
		
	}
}
