package logicals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateWordsFromString {

	public static void main(String[] args) {

		String str = "my name is hriday kumar what my name is Hriday Kumar";
		System.out.println("Given String is : "+str+"\n");
		String[] strArray = str.toLowerCase().split(" ");
		//Logical Style
		findRepeationOfWords(strArray);
		
		//Java 8 Style
		
		// Find duplicate words using Java 8 Streams
		Map<String, Long> strMap = Arrays.asList(strArray)
										.stream()
										.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		// Filter and collect words that appear more than once
		List<String> duplicateWords = strMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
		System.out.println("Duplicate are : "+duplicateWords);
	}
	
	public static void findRepeationOfWords(String[] strArray) 
	{
		

		Map<String, Integer> strMap = new HashMap<>();

		for(String word : strArray) {

			if(strMap.get(word) != null) {

				strMap.put(word, strMap.get(word)+1);

			}
			else
				strMap.put(word, 1);
		}

		Set<String> wordSet = strMap.keySet();

		Iterator<String> wordItr = wordSet.iterator();

		while (wordItr.hasNext()) {

			String word = wordItr.next();
			if(strMap.get(word) > 1)
				System.out.println(word+"  =  "+strMap.get(word));

		}
	}
	

}
