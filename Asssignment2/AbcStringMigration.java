package Asssignment2;

import java.util.Scanner;

public class AbcStringMigration {
	
	String a = "abcdef";
	String b = "xyz1234";
	String c = "abcxy";
	Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		AbcStringMigration am=new AbcStringMigration();
		//am.getStringInputs();
		
		/*
		 * Verify the length of the ‘a’ variable should be greater than the length of the c variable 
		 * and should be less than the length of the b variable
		 */
		int a_len= am.a.length();
		int b_len= am.b.length() ;
		int c_len= am.c.length() ;	
		if((a_len > c_len) && (a_len < b_len)) {
			System.out.println("1. length of the ‘a’ variable is > 'c'& < 'b' as expected !! ");	
		}else {
			System.out.println("1. length of the ‘a’ variable not as per requirement.Please check");
		}
		
		/*
		 * ▪ ‘a’ variable should not be the same as the ‘b’ variable and ‘c’ variable
		 */
		if(am.a.equals(am.b)&& am.a.equals(am.c)) {
			System.out.println("2. 'a' should not be equal to 'b' OR 'c'");
		}else {
			System.out.println("2. This is as Expected -'a' should not be equal to 'b' or 'c'");
		}
		
		/*
		 * ‘c’ variable should be the same as a variable irrespective of the case
		 */
		if(am.c.equalsIgnoreCase(am.c)) {
			System.out.println("3. This is as Expected for c variable.");
		}else {
			System.out.println("3. This is not an expected result !!");
		}
		/*
		 * ▪ ‘a’ variable should contain cd and should not contain xy.
		 */
		if(am.a.contains("cd") && !(am.a.contains("xy"))) {
			System.out.println("4. Variable'a' contains cd & doesnt have 'xy'.This is the expected result ");
		}else {
			System.out.println("4. Variable'a' should contain cd & shouldn't have 'xy'.");
		}
		
		
		/*
		 * Convert the ‘b’ variable into uppercase and verify it should contain “Z” and 
		 * should not contains “z”.
		 */
		am.b=am.b.toUpperCase();
		
		if(am.b.contains("Z")) {
			System.out.println("5. This is the expected result- Varibale 'b' has 'Z'");
		}else {
			System.out.println("5. Varibale 'b' should have 'Z' not 'z'");
		}
				
		/*
		 * Perform concatenate on ‘a’ and ‘b’ variables and verify the length is less than 
		 * the ‘c’ variable’s length or greater than 5.
		 */
		String concat= am.a+am.b;
		
		int concat_len= concat.length();
		if((concat_len < c_len) || (concat_len > 5) ) {
			System.out.println("6. This is the expected result after concatenation");
		}else {
			System.out.println("6. Please check the inputs again.");
		}
		
		/*
		 * Validate if the ‘a’ variable start with “ab” and the ‘b’ variable should not ends 
		 * with “yz”.
		 */
		if(am.a.startsWith("ab") && !(am.b.endsWith("yz"))) {
			System.out.println("7. This is the expected result-a’ variable start with"
					+ " 'ab' & the ‘b’ variable shouldnt end with 'yz'");
		}else {
			System.out.println("7. Please check the inputs again.");
		}
		
		/*
		 * ▪ Validate if the ‘c’ variable contains space and should not contain 9
		 */
		if(!(am.c.contains(" ") || am.c.contains("9"))) {
			System.out.println("8. This is the expected result- C variabke shouldn't have space or 9");
		}else {
			System.out.println("7. Please check the inputs again.");
		}
		
		
	}
	
	public void getStringInputs() {
		System.out.println("Please give the value for variable 'a' e.g. abcdef :");
		a = input.next();
		input.reset();
		System.out.println("Please give the value for variable 'b' e.g. xyz1234 :");
		b = input.next();
		input.reset();
		System.out.println("Please give the value for variable 'c' e.g. abcxy :");
		c = input.next();
		input.reset();
		System.out.println("Input given by you : \n" + a+" , "+b+" , "+c);
	}

	

}
