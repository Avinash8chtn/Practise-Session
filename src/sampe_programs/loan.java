package sampe_programs;

public class loan extends Abstract {

	public void gold_loan()
	{
		System.out.println(" gold loan ");
	}
	
	public static void main(String[] args)
	{
		loan l = new loan();
		
		l.car_loan();
		l.gold_loan();
		l.home_loan();
	}
}
