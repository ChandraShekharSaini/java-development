package WieldCard;

import java.util.*;

public class LowerBoundedWildcards {


	public static void Calculater(List<? super Integer> list) {
		
		for(Object x:list) {
			System.out.println(x);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList();
		
		l1.add(1);
		l1.add(2);
		
		Calculater(l1);
		
		
		List<Number> l2 = new ArrayList();
		
		l2.add(12);
		l2.add(123);
		l2.add(45);
		
		Calculater(l2);
	}
}
