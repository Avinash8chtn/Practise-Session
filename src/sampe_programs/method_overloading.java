package sampe_programs;

public class method_overloading {

	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	
	public void add(int i , int j , int k)
	{
		System.out.println(i+j+k);
	}
	
	public static void main(String[] args)
	{
		method_overloading m = new method_overloading();
	
				m.add(3, 4);
				m.add(5, 6, 8);
	}
}
