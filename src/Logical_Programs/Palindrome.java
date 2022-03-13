package Logical_Programs;

public class Palindrome {

	public static void main(String[] args) {
		
		int n = 1441, r , sum = 0;
		int temp = n;
		
		while(n>0)
		{
			n = n % 10;
			r = n / 10;
			sum = sum * 10 + r;
		}
		
		if(temp == sum)
		{
			System.out.println(" it is a palindrome ");
		}
		
		else
			
		{
			System.out.println(" it is not a palindrome ");
		}
	}
}
