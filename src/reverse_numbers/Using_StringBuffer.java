package reverse_numbers;

public class Using_StringBuffer {
	
	public static void main(String[] args) {
		
		StringBuffer rev;
		
		int num = 1234;
		System.out.println(" the original number is : "+num);
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		
		System.out.println(" the reversed number is : "+sb.reverse());
		
		
		

		
// String.valueOf() --> converts the num to String and that value will store in "sb"
		
		
	}

}
