package Logical_Programs;

public class Prime_numbers {
	
	public static void main(String[] args) {
		
	   int num = 11;
		
		
		boolean isPrime = true;
		
		for (int i=2; i<num/2; i++)
		{
			if(num%i==0)
			{
				isPrime = false;
				break;
			}
		}
		
		System.out.println(" the given number is : " +num);
		
		if(isPrime)
		{
			System.out.println(" the number is prime : "+isPrime);
		}
		
		else 
		{
			System.out.println(" the number is not prime");
		}
	}

}
