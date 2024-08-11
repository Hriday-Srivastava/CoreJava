package logicals;

public class ReverseOfString {

	public static void main(String[] args) {
		
		//Logical way
		String str = "Hriday";
		String reverse = reverseString(str);
		System.out.println("The reverse of "+str+" = "+reverse);

		//Using recursion reverse the String.
		System.out.println("Using RECURSION the reverse of "+str+" = "+recursionReverseString(str));
	}
	
	public static String reverseString(String str) {

		char[] charArray = new char[str.length()];

		for(int i = charArray.length- 1, j = 0; i >= 0; i--) {

			charArray[j] = str.charAt(i);
			j++;
		}
		return new String(charArray);
	}
	
	public static String recursionReverseString(String str) {

		if(str.length() == 0)
			return "";
		else
			return str.charAt(str.length() - 1) +recursionReverseString(str.substring(0,str.length() - 1));


	}

}
