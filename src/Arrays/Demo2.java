package Arrays;

public class Demo2 {

	public static void main(String[] args)
	{
		try {
			
		String[] names = {"Avinash" , "mokesh", " Kisho", "anni ma", " nivi papa"};
		
		System.out.println("the name displayed is : "+names[12]);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("End of the program");
		}
	}
	

}
