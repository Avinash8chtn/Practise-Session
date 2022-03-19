package Logical_Programs;

public class prime_numbers_another_way {
	
	public static void main(String[] args) {
		
		int count = 0;
		int num = 23;
		
		if(num>1) // num should be greater than 1
		{
			for(int i=1; i<=num;i++)
			{
				if(num%i==0) // if it is divisible it will increment it or else it will not increment.
				count++;
			}
			if(count==2) // if the count is equivalent to 2 factors ie: 1 and 19 --> then it is prime number 
			{
				System.out.println("it is a prime number");
			}
			else
			{
			System.out.println(" it is not a prime number ");
			}
		}
		else
		{
			System.out.println(" it is not prime number");
		}
			
	}

}


