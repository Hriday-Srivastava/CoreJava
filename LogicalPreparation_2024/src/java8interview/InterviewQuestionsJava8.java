package java8interview;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewQuestionsJava8 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// mapToInt() always take (Integer :: intValue) as argument. 
		/*
		 1. Sum of a list. ================= Asked in Wipro
		 2. Min and Max value from a list. ============== Asked in Citius Tech
		 3. Find the duplicate number from a given Integer list.==================Asked in Citius Tech
		 4. Given the list of employee, group them by employee name.=================Asked in Wipro
		 5. Sorting a Map as per key.===================Asked in CAPGEMINEE
		 6. Sort a Map as per key in descending order.
		 */
		/*
		 6. Write the java 8 code for printing the odd and even from a list.
		 7. Write the java 8 code to remove the duplicate number from a array like {20,20,30,30,45,96,2,}
		 8. Character repeat count.
		 9. To count the occurrences of words from a given string 
		 9. Reverse the order of the array using streams
		 10.Sort the list using Stream API
		 11. Difference between Map & FlatMap	
		*/		
		//1. Sum of a list ================= Asked in Wipro
		List<Integer> listForSum = new ArrayList();
		listForSum.add(20);listForSum.add(20);listForSum.add(30);listForSum.add(10);listForSum.add(20);
		
		//First Method
		Integer sumOfList = listForSum.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println("Sum of a list : "+sumOfList);
		
		//Second  Method612
		
		Integer sumOfList1 = listForSum.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of a list : "+sumOfList1);
		
		Integer[] intArray = new Integer[] {20,20,30,30,3,8,6,3};
		List<Integer> intList = Arrays.asList(intArray);
		//2. Min and Max value from a list ============== Asked in Citius Tech
		System.out.println("Given list is : "+Arrays.toString(intArray));
		Integer min = intList.stream().min(Integer::compareTo).get();
		Integer max = intList.stream().max(Integer::compareTo).get();
		//Second Method :
		OptionalInt opt = intList.stream().mapToInt(Integer::intValue).max();
		max = opt.getAsInt();
		System.out.println("Max is :"+max);
		//Third Method
		max = intList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Max number is : "+max);
		
		System.out.println("Minimum value from a list is : "+min);
		System.out.println("Maximum value from a list is : "+max);
		
		//3. Find the duplicate numbers from a given Integer list.==================Asked in Citius Tech
		System.out.println("A Given list is : "+intList);
		Set<Integer> intSet = new HashSet();
		//First Method
		//Set<Integer> duplicateSet = intList.stream().filter(n -> ! intSet.add(n)).collect(Collectors.toSet());
		//Second Method
		Set<Integer> duplicateSet = intList.stream().filter(i -> Collections.frequency(intList, i) > 1).collect(Collectors.toSet());
		
		System.out.println("Duplicate Number in a given list : "+duplicateSet);
				
		Employee emp1 = new Employee("Jyoti", 30);
		Employee emp2 = new Employee("Verma", 32);
		Employee emp3 = new Employee("Shyam", 50);
		Employee emp4 = new Employee("Arbind", 44);
		Employee emp5 = new Employee("Jyoti", 31);
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(emp1); empList.add(emp2);empList.add(emp3);empList.add(emp4);empList.add(emp5);
		
		//4. Given the list of employee, group them by employee name.=================Asked in Wipro
		System.out.println("Given Employee list is : "+empList);
		Map<String, List<Employee>> map = empList.stream().collect(Collectors.groupingBy(Employee::getName));
		map.forEach((name,empList1) -> System.out.println("Name : "+name +"->"+empList1));
		
		
		//5. Sorting a Map as per key.===================Asked in CAPGEMINEE
		Map<String, Integer> marksMap = new HashMap();
		marksMap.put("Math", 97);	marksMap.put("Physics", 95);	marksMap.put("Chemistry", 92);	marksMap.put("Languages", 98);
		
		Map<String, Integer> sortedMap = new LinkedHashMap();
		
		marksMap.entrySet().stream()
		.sorted(Map.Entry.<String, Integer>comparingByKey())
		.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
		System.out.println("Sorted Map is : "+sortedMap);
		
		//6. Sorting a Map as per value.===================Asked in CAPGEMINEE
		Map<String, String> tempratureMap = new HashMap<>();
		tempratureMap.put("Aurangabad", "20Degree");		tempratureMap.put("Patna", "22Degree");
		tempratureMap.put("Gaya", "19Degree");		tempratureMap.put("Muzzafarpur", "25Degree");
		
		Map<String, String> sortedTempratureMap = new LinkedHashMap<>();
		
		tempratureMap.entrySet().stream()
		.sorted(Map.Entry.<String,String>comparingByValue())
		.forEachOrdered(x -> sortedTempratureMap.put(x.getKey(), x.getValue()));
		System.out.println("Sorted Map as per value : "+sortedTempratureMap);
		
		// 6. Sort a Map as per key in descending order.
		Map<String, Integer> descendingOrderMap = new LinkedHashMap<>();
		
		marksMap.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByKey().reversed()).
		forEachOrdered(m -> descendingOrderMap.put(m.getKey(), m.getValue()));
		System.out.println("A map is in descending order by key :"+descendingOrderMap);
		
		
		//7. Write the java 8 code for printing the odd and even from a list.
		
		Integer[] intArray2 = new Integer[] {2,3,4,8,15,23,20,89};
		System.out.println("Given array is : "+Arrays.toString(intArray2));
		
		System.out.println("Even numbers are : ");
		
		Arrays.stream(intArray2).filter(i -> i%2 == 0).forEach(System.out :: println);
		
        System.out.println("Odd numbers are : ");
		
		Arrays.stream(intArray2).filter(i -> i%2 != 0).forEach(System.out :: println);
		
		//8. Write the java 8 code to remove the duplicate number from a array like {20,20,30,30,45,96,2,}
		
		//7. Write the java 8 code to remove the duplicate number from a array like {20,20,30,30,45,96,2,}
		
		Integer[] intArray5 = new Integer[] {20,20,12,23,56,45,45,2,2};
		List<Integer> integerrList = Arrays.asList(intArray5);
		Set<Integer> setInteger = new HashSet<>();
				
		Set<Integer> setInt = integerrList.stream().filter(j -> !setInteger.add(j)).collect(Collectors.toSet());
				
		System.out.println("Duplicate number are eliminated: "+setInteger.toString());
		System.out.println("Duplicate number are "+setInt);
				
		// 8. Character repeat count
		String inputString = "hriday Kumar srivastava";
		Map<Character, Long> charCountMap = inputString.chars()//returns an IntStream of characters from the string.
												.mapToObj(c -> (char)c)//converts each integer value to a character.
												.filter(Character :: isLetterOrDigit)//filters out non-alphanumeric characters
												.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));//groups the characters by identity (i.e., themselves) and counts their occurrences.
		
		
				
		//9.  Display character count
		charCountMap.forEach((character, count) -> System.out.println(character + ": " + count));
		
		//10. To count the occurrences of words from a given string 
		String sentence = "hello world hello java world";
        Map<String, Long> wordCounts = Arrays.stream(sentence.split("\\s+"))// splits the string into words based on whitespace characters (such as space, tab, or newline), creating an array of words.
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print word counts
        wordCounts.forEach((word, count) ->
                System.out.println(word + ": " + count));
		        
		// 10. Reverse the order of the array using streams       
		int[] array = {12, 13, 14};
		int[] reversedArray = Arrays.stream(array)
		                                    .boxed() // convert int to Integer
		                                    .sorted(Collections.reverseOrder()) // sort in reverse order
		                                    .mapToInt(Integer::intValue) // convert back to int
		                                    .toArray();
		        
		// 11. Sort the list using Stream API
		        integerrList.stream()
		               .sorted()
		               .forEach(System.out::println);
		        
	   // 12. Sort the list in descending order using Stream API
		        List<Integer> sortedDescending = integerrList.stream()
		                                                .sorted(Comparator.reverseOrder())
		                                                .collect(Collectors.toList());

		        // Print the sorted list
		        System.out.println("Sorted list in descending order:");
		        sortedDescending.forEach(System.out::println);
		        
		// 11. Difference between Map & FlatMap
		List<Customer>  customerList = new ArrayList<>();
		Customer customer1 = new Customer(1, "Hriday", "hri@gamil.com", Arrays.asList("111111222","2221111"));
		Customer customer2 = new Customer(1, "Kumar", "kumar@gamil.com", Arrays.asList("4444222","55551111"));
		Customer customer3 = new Customer(1, "Pammo", "pammo@gamil.com", Arrays.asList("8881222","222115511"));
		
		customerList.add(customer1);customerList.add(customer2);customerList.add(customer3);
		// map()  : need to find here phone numbers of each customer in a list like [ [], [], [] ]
		List<List<String>> phoneNumberCustomerWise = customerList.stream()
				                                     .map(customer -> customer.getPhoneNumbers())
				                                     .collect(Collectors.toList());
		System.out.println("PhoneNumbers are : "+phoneNumberCustomerWise);
		
		//flatMap() : need to combine all phone numbers of Customers in a single list. like [, , , , , , , ,]
		List<String> phoneNumbers = customerList.stream()
				    				.flatMap(customer -> customer.getPhoneNumbers().stream())
									.collect(Collectors.toList());
		System.out.println("Phone Number using flatMap"+"("+") method : "+phoneNumbers);
		
		
		
		LocalDate date = LocalDate.now();System.out.println("Date is : "+date);
		LocalTime time = LocalTime.now();System.out.println("Time is : "+time);
		LocalDateTime dateTime = LocalDateTime.now();System.out.println(dateTime);
		
			
		
	

	}



}
