package Unicode_calc;

import java.util.Scanner;

public class Unicode_calculator {
		
private static Scanner scnr;

public static void main(String [] args) {

	scnr = new Scanner(System.in);
	String string1;
	String string2;
	int x = 0;
	int string1Value = 0;
	int string2Value = 0;
	int absValue;
		
	System.out.println("Enter two words please:");
	string1 = scnr.next();
	string2 = scnr.next();
	
	
	while(x <= string1.length() -1 ) {
		string1Value = string1Value + string1.charAt(x);
		x = x + 1;
	}
	
	x = 0;
	
	while(x <= string2.length() -1 ) {
		string2Value = string2Value + string2.charAt(x);
		x = x + 1;
	}
	
	absValue = Math.abs(string1Value - string2Value);
	
	System.out.print(absValue);
}
}