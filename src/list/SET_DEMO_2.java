package list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SET_DEMO_2 {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,5,4,2,9,8,5,4,5};
		
		Set<Integer> s = new TreeSet<Integer>();
		
		s.add(a[0]);
		s.add(a[1]);
		s.add(a[2]);
		s.add(a[3]);
		s.add(a[4]);
		s.add(a[5]);
		s.add(a[6]);
		s.add(a[7]);
		s.add(a[8]);
		s.add(a[9]);
		s.add(a[10]);
		
		
		Iterator<Integer> iterator = s.iterator();
		
		while(iterator.hasNext())
				{
			System.out.println(iterator.next());
				}
		
		
		
	}
}
