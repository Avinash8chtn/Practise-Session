package inhertance;

public class heros extends marvel{
	
	public void black_widow()
	{
		System.out.println(" she can fight");
	}
	
	public void flash()
	{
		System.out.println(" he can run fast ");
	}
	
	public static void main(String[] args)
	{
		heros s = new heros();
		
		s.superman();
		s.ironman();
		s.black_widow();
		s.flash();
			
	}

}
