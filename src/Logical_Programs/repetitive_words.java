package Logical_Programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class repetitive_words {

	public static void main(String[] args) {
		
		String input = " I am am Avinash Avinash";
		// String output = " I am Avinash";
		
		String[] inArry = input.split(" ");
		
	    Set<String> s = new LinkedHashSet<String>();
	    
	    for(String str : inArry)
	    {
	    	s.add(str);
	    }
	    
	    Iterator  i = s.iterator();
	    
	    while(i.hasNext())
	    {
	    	System.out.print(i.next()+ " ");
	    }
	}
}
