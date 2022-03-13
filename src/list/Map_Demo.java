package list;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Demo {
	
	public static void main(String[] args) {
		
		Map <Integer,Object> m = new LinkedHashMap<Integer,Object>();
		
		m.put(1, "java");
		m.put(2, 10);
		m.put(3, 23.5);
		
		System.out.println("the result is : " +m);
	}

}
