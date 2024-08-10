package logicals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number to check palindrome : ");
		int number = Integer.parseInt(bufferedReader.readLine());
		
		int copyNumber = number;
		int mod = 0;
		int reverseNum = 0;
		
		
		while(copyNumber!=0)
		{
		mod = copyNumber % 10;
		reverseNum = reverseNum * 10 + mod;
		copyNumber = copyNumber/10;
		} 
		
		if(number == reverseNum) {
			System.out.println("Given number is palindrome");
		}else
			System.out.println("Given number is not palindrome");


	}

}
