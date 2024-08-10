package logicals;

import java.util.Arrays;

public class AnagramCheck {

	public static String sortingCharArray(char[] ch) {
		
		char temp;
		for(int i = 1; i<ch.length; i++) {
			
			for(int j = 0; j<ch.length-i; j++) {
				
				if(ch[j] > ch[j+1]) {
					temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = temp;
				}
			}
		}
		return new String(ch);
	}
	
	public static void main(String[] args) {
		
		String str1 = "heart"; String str2 = "earth";
		//Logical Method
		String sortedStr1 = sortingCharArray(str1.toCharArray());
		String sortedStr2 = sortingCharArray(str2.toCharArray());
		
		System.out.println(str1+" and "+str2+" are anagram ? "+sortedStr1.equals(sortedStr2));
		
		//Predefined Method
		boolean isAnagram = Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray());
		System.out.println(str1+" and "+str2+" are anagram ? "+isAnagram);

	}

}
