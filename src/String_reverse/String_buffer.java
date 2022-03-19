package String_reverse;

public class String_buffer {
	
	public static void main(String[] args) {
		
		String str = " I am Spider man";
		
		StringBuffer sb = new StringBuffer(str);  // ---> here pass the parameter "str"
		
		System.out.println("the reversed string is : " +sb.reverse());
		
		
	}

}
