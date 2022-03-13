package Logical_Programs;

public class factorial_using_for_loop {
	
	public static void main(String[] args) {
		
		int fact = 1;
		int number = 5;
		
		for (int i = 1; i <= number ; i++)
		{
		     fact = fact * i;
		}
		
		System.out.println("the factorial of " +number+ " is :" +fact);
	}

}
