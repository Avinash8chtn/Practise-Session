package String_reverse;

public class String_concatenation_type_ {
	
	public static void main(String[] args) {
		
		String str = "My Name Is Avinash Avi";
		
		String rev = "";
		
		int len = str.length();
		
		System.out.println(" the length is "+len);
		
		for(int i = len-1;i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println(" the original string is  "+str);
		
		System.out.println(" the reversed string is : "+rev);
	}

}
