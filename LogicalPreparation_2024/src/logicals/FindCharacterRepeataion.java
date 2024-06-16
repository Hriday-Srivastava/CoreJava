package logicals;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCharacterRepeataion {

	public static void main(String[] args) {
		
		String str = "Better Butter";
		//Java 8 Style
		Map<Character, Long> charCountMap = str.chars()//returns an IntStream of characters from the string.
											.mapToObj(i ->(char)i)//converts each integer value to a character.
											.filter(Character :: isLetterOrDigit)//filters out non-alphanumeric characters
											.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		charCountMap.forEach((k,v) -> System.out.println(k+" = "+v));
		
		System.out.println("=============================================");
		
		//Logical Style
		Map<Character, Integer> charMap = countChar(str);
		
		Set<Entry<Character, Integer>> charSet = charMap.entrySet();
		
		Iterator<Entry<Character, Integer>> charItr = charSet.iterator();
		
		while(charItr.hasNext()) {
			
			Map.Entry<Character, Integer> charEntry = charItr.next();
			
			System.out.println(charEntry.getKey()+" = "+charEntry.getValue());
		}
		

	}
	public static Map<Character, Integer> countChar(String str) {
		
		Map<Character, Integer> charMap = new HashMap<>();
		
		for(int i = 0; i < str.length(); i++) {

			if(charMap.get(str.charAt(i)) != null) {

				charMap.put(str.charAt(i), charMap.get(str.charAt(i))+1);

			}
			else
				charMap.put(str.charAt(i),1);
		}
		return charMap;
	}

}
