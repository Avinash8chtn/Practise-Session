package Arrays;

public class Demo {

	// syntax for array :
	
	// Datatype variable_name [] = new Datatype [length];
	
	// eg : int a[] = new int [5];
	
	// eg : int a[] = {8,5,4,6,2};
	
	// index based : starts from 0,1,2,3,4,5 
	
	public static void main(String_demo[] args)
	{
		
		try {
		int a [] = new int [5];
		{
			a[0] = 10;
			a[1] = 25;
			a[2] = 26;
			a[3] = 23;
			a[4] = 33;
			
		}
		
		System.out.println(" the number is : " +a[5]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println(" Result Failed ");
		}
	}
	
	
	
 }
