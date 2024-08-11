package logicals;

import java.util.Scanner;

public class NumberToWords {

	private static final String[] units = {
	        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
	        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
	    };

	    private static final String[] tens = {
	        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
	    };

	    private static String convert(int number) {
	        
	    	if(number < 0) {
	    		return "Minus" + convert(-number);
	    	}
	    	
	    	else if (number < 20) {
	            return units[number];
	        }

	    	else if (number < 100) {
	            return tens[number / 10] + ((number % 10 != 0) ? " " : "") + units[number % 10];
	        }

	    	else if (number < 1000) {
	            return units[number / 100] + " Hundred" + ((number % 100 != 0) ? " " : "") + convert(number % 100);
	        }

	    	else if (number < 100000) {
	            return convert(number / 1000) + " Thousand" + ((number % 1000 != 0) ? " " : "") +convert(number % 1000);
	        }

	    	else if (number < 10000000) {
	            return convert(number / 100000) + " Lakh" + ((number % 1000000 != 0) ? " " : " ") +convert(number % 100000);
	        }
	    	else
	        return convert(number / 10000000) + " Crore" + ((number % 10000000 != 0) ? " " : " ") +convert(number % 10000000);
	    }

	    public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
	    	System.out.println("Enter Number : ");
	        int number = scan.nextInt();
	        System.out.println("In Words: " + convert(number));
	    }

}
