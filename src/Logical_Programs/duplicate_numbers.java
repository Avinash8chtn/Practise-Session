package Logical_Programs;

public class duplicate_numbers {
	
	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,2,5,6,2,8,6,4,3,8};
		
		for (int i = 0; i<a.length-1; i++)
		{
			for (int j = i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(" the duplicate values are : "+a[j]);
				}
			}
		}
	}

}
