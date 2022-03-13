package Logical_Programs;

import java.util.Scanner;

public class String_reverse_customized_concept {
	
	public static void main(String[] args) {
		
		String original;  // for storing user input. 
		String rev = ""; // for storing reverse of the string. 
		
		System.out.println(" enter the string : ");
		
		Scanner sc = new Scanner(System.in);
		original = sc.nextLine();
		
	    int length = original.length();
	    
	    for (int i = length-1; i>=0; i--)
	    	
	    {
	    	rev = rev + original.charAt(i);
	    }
	   
	    
	    System.out.println(" entered string is : " +original);
	    System.out.println(" reversed string is : " +rev);
		
	}

}
