package logicals;

public class PalindromeCheckForString {

	public static void main(String[] args) {
		
		String str = "Madam";
		String str1 = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			str1 = str1+str.charAt(i);
			
		}
		
		System.out.println("Is "+str+" Palindrome ? : "+str.equalsIgnoreCase(str1));
		
		

	}

}
