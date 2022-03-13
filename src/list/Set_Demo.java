package list;

import java.util.HashSet;
import java.util.Set;

public class Set_Demo {

	public static void main(String[] args) {
		
		Set <Integer> s = new HashSet<Integer> ();
		
		s.add(20);
		s.add(36);
		s.add(45);
		s.add(80);
		s.add(74);
		s.add(45);
		s.add(21);
		
		
		
		s.remove(5);
		
		System.out.println(" the results are : " +s);
	}
	
}
