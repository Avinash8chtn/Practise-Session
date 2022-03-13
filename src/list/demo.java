package list;

import java.util.ArrayList;
import java.util.List;



public class demo {

	public static void main(String[] args) {
		
		// List <Integer> li = new ArrayList<Integer>();
		
		
		List <Integer> li = new ArrayList<Integer>();
		
		
		li.add(10);
		li.add(15);
		li.add(20);
		li.add(25);
		li.add(30);
		li.add(35);
		
		li.remove(2);
		
		System.out.println(" the arraylist is : " +li);
		
		int size = li.size();
		System.out.println(" display the size :  " +size);
		
		Integer Int = li.get(3);
		System.out.println(" get the size : " +Int);
		
//		li.clear();
//		System.out.println(li);
		
		
		
		
		
	}
}
