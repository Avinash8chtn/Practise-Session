package reverse_numbers;

public class using_StringBuilder {
	
	public static void main(String[] args) {
		
		int num = 1234;
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(num);
		
		System.out.println("the original number is : "+num);
		
		System.out.println(" the reversed number is : "+sb.reverse());
	}

}
