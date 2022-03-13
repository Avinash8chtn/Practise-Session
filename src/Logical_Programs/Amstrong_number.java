package Logical_Programs;

public class Amstrong_number {
	
	public static void main(String[] args) {
		
		int n = 54748;
		int temp = n;
		int r, sum = 0;
		
		System.out.println(" the given number is : " +n);
		
		while (n>0)
		{
		r = n % 10;
		n = n / 10;
		sum = sum + r*r*r*r*r;
		
		}
		
		if (temp == sum)
		{
			System.out.println(" it is a amstrong number");
		}
		
		else
		{
			System.out.println(" not an amstrong number ");
		}
		
	}

}
