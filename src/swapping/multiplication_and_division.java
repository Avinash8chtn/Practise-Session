package swapping;

public class multiplication_and_division {

	public static void main(String[] args) {
		
		// without using 3rd variable
		
		// here "a" and "b" should not be zero
		
		int a = 10, b = 20;
		
		System.out.println(" before swapping : "+a+" "+b);
		
		a = a * b; // 200
		
		b = a / b; // 10
		
		a = a / b; // 20
		
		System.out.println(" after swapping : "+a+" "+b);
		
	}
}
