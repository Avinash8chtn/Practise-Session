package sampe_programs;

public class method_overriding {

	public void boyName()
	{
		System.out.println(" kisho ");
	}
	
	public void girName()
	
	{
		System.out.println(" anni ma ");
	}
	
	public static void main(String[] args)
	{
		method_overriding r = new method_overriding();
		
		r.boyName();
		r.girName();
	}
}
