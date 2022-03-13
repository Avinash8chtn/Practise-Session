package Logical_Programs;

import java.util.Scanner;

public class String_reverse_java_api {
	
public static void main(String[] args) {
		
		String original;  // for storing user input. 
		String rev = "";  // for storing reverse of the string. 
		
		System.out.println(" enter the string : ");
		Scanner sc = new Scanner(System.in);
		original = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(original);
		rev = sb.reverse().toString();
	    
	    System.out.println(" entered string is : " +original);
	    System.out.println(" reversed string is : " +rev);
		
	}

}
