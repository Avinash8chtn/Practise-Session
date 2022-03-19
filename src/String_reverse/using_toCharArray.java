package String_reverse;

public class using_toCharArray {

	public static void main(String[] args) {
		
		String str = " I am Iron Man";
		String rev = "";
		
		char a[]  = str.toCharArray();
		
		int len = str.length();
		
		System.out.println(" the length is : "+len);
		
		for(int i = len-1; i>=0; i--)
		{
			rev = rev + a[i];
		}
		
		System.out.println(" the original string is  "+str);
		
		System.out.println(" the reversed string is : "+rev);
	}
}
