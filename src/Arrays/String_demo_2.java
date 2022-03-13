package Arrays;

public class String_demo_2 {
	
	public static void main(String[] args) {
		
		String s = "Welcome to Java";
		
		int l = s.length();
		
		boolean e = s.equals("welcome to Java");
		System.out.println(e);
		
		boolean e2 = s.equalsIgnoreCase("welcome to java");
		System.out.println(e2);
		
		int i = s.indexOf("a");
		System.out.println(i);
		
		int i2 = s.lastIndexOf("t");
		System.out.println(i2);
		
		char charAt = s.charAt(8);
		System.out.println(charAt);
		
		String replace = s.replace("to", "at");
		System.out.println(replace);
		
//		boolean empty = s.isEmpty();
//		System.out.println(empty); ----> doubt
		
//		String[] split = s.split("welcome to Java");
//		System.out.println(split); ---> doubt 
		
		
		System.out.println(" the length of the program is : "+l);
	}

}
