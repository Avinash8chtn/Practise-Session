package sampe_programs;

public class method_overriding2 extends method_overriding{
	
	public void boyName()
	
	{
		super.boyName();   // over-riding
		System.out.println(" avinash");
	}
	
	public void girlName(int id)
	
	{
		super.girName();  // over-riding
		System.out.println(id);
	}
	
	public static void main(String[] args)
	{
		method_overriding2 r2 = new method_overriding2();
		
		r2.boyName();
		r2.girlName(24);
	}

}
