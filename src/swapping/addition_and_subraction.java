package swapping;

public class addition_and_subraction {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		System.out.println(" before swapping : "+a+" "+b);
		
		a = a + b;  // 30
		
		b = a - b;  // 10
		
		a = a - b; // 20
		
		System.out.println(" after swapping : "+a+" "+b);
	}
}
