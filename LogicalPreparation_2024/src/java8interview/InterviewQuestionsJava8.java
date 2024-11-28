package java8interview;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
		 
		 	
		 	
		//12. Find the  map of employee as per key "EmployeeId" and value "EmployeeName" and whose salary is less<300000.
		//13. Get all department in a list from Employee list.
		//14. Sort the employee list as per salary.
		//15. Find the max and min paid salary employee from Employee list.
		//16. gender(key) -> [names](value)    groupingBy and mapping
		//17. Find the total number of employee as per male or female.      groupingBy
		//18. anyMatch(predicate), allMatch(predicate), nonMatch(predicate)  all return type is boolean.
		//19. Find top 2 paid employee. limit(2)
		 * 
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
		List<Integer> duplicateList = intList.stream().filter(i -> intSet.add(i)).toList().stream().distinct().toList();
		//Second Method
		//Set<Integer> duplicateSet = intList.stream().filter(n -> ! intSet.add(n)).collect(Collectors.toSet());
		//Third Method
		//List<Integer> dupList = intList.stream().filter(e -> !intSet.add(e)).toList();
		//Fourth Method
		Set<Integer> duplicateSet = intList.stream().filter(i -> Collections.frequency(intList, i) > 1).collect(Collectors.toSet());
		
		System.out.println("Duplicate Number in a given list : "+duplicateSet);
				
		Employee emp1 = new Employee("Jyoti", 30, 30000, "HR","Female");
		Employee emp2 = new Employee("Verma", 32, 40000,  "Finance", "Male");
		Employee emp3 = new Employee("Shyam", 50, 25000, "Training", "Male");
		Employee emp4 = new Employee("Arbind", 44, 50000, "Engineering","Male");
		Employee emp5 = new Employee("Jyoti", 31, 450000, "Engineering","Female");
		
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
		
		  int[] reversedArray = Arrays.stream(array) .boxed() // convert int to Integer
		  .sorted(Collections.reverseOrder()) // sort in reverse order
		  .mapToInt(Integer::intValue).toArray(); // convert back to int .toArray();
		 
		// 11. Sort the list using Stream API
		        integerrList.stream()
		               .sorted()
		               .forEach(System.out::println);
		        
		        //Second method
		        integerrList.stream().mapToInt(Integer :: intValue).sorted().boxed().toList().forEach(System.out::println);
		        
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
		
		//===========================2=======0===========2========4============
		// Sort below intArray into descending order and remove 3 and get into an Array using Stream api.
		int[] intArrr = {0,0,1,1,0,0,3};
		int[] actualArray = Arrays.stream(intArrr).boxed().sorted(Comparator.reverseOrder())
		.skip(1).mapToInt(Integer::intValue).toArray();
		System.out.println("Sorted Array after removing 3 : "+Arrays.toString(actualArray));
		
		//We have List of Employee object. group by salary(in descending order) and as per department = Engineering  
		Map<Double, List<Employee>> descedingSalaryMap = empList.stream()
                .filter(e -> "Engineering".equals(e.getDepartment())) // Filter by department "Engineering"
                .collect(Collectors.groupingBy(
                        Employee::getSalary,        // Group by salary
                        () -> new TreeMap<>(Comparator.reverseOrder()),  // Use TreeMap to sort keys in descending order
                        Collectors.toList()         // Collect as List
                    ));
		
		// Print the result
		descedingSalaryMap.forEach((salary, empListt) -> {
            System.out.println("Salary: " + salary);
            empListt.forEach(System.out::println);
        });
		
		
		//12. toMap(). Find the  map of employee as per key "EmployeeSalary" and value "EmployeeName" and whose salary is less<400000.
		Map<Double, String> empMap = empList.stream().filter(emp -> emp.getSalary()<= 40000)
									  .collect(Collectors.toMap(Employee :: getSalary, Employee :: getName));
		System.out.println("Use of toMap() method of Collectors "+empMap);
		
		//13. Get all department in a list from Employee list.
		List<String> departmentList = empList.stream().map(Employee :: getDepartment).distinct().toList();
		System.out.println("All departments are of Employees : "+departmentList);
		
		//14. Sort the employee list as per salary.
		List<Employee> sortedListAsPerSalary = empList.stream().sorted(Comparator.comparing(Employee :: getSalary).reversed()).toList();
		System.out.println("Sorted List as per Salary : "+sortedListAsPerSalary);
		
		//15. Find the max and min paid salary employee from Employee list.
		Employee highestPaidEmployee = empList.stream().max(Comparator.comparing(Employee :: getSalary)).get();
		System.out.println("Highest Paid Salary Employee is : "+highestPaidEmployee);
		Employee minimumPaidEmployee = empList.stream().min(Comparator.comparing(Employee :: getSalary)).get();
		System.out.println("Minimum paid salary employee is : "+minimumPaidEmployee);
		
		//16. gender(key) -> [names](value)
		Map<String, List<String>> employeeAsPerGender = empList.stream()
														.collect(Collectors.groupingBy(Employee :: getGender, Collectors.mapping(Employee :: getName, Collectors.toList())));
		System.out.println("All employees as per gender : "+employeeAsPerGender);
		
		//17. Find the total number of employee as per male and female.
		Map<String, Long> countOfEmpAsPerGender = empList.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.counting()));
		System.out.println("Count of employees as per Gender : "+countOfEmpAsPerGender);
		
		//19. Find top 2 paid employee. limit(Long MaxSize);
		List<Employee> top2Employees = empList.stream().sorted(Comparator.comparing(Employee :: getSalary).reversed())
										.limit(2).toList();
		System.out.println("Most paid 2 Employees are : "+top2Employees);
		
		LocalDate date = LocalDate.now();System.out.println("Date is : "+date);
		LocalTime time = LocalTime.now();System.out.println("Time is : "+time);
		LocalDateTime dateTime = LocalDateTime.now();System.out.println(dateTime);
		
		LocalDateTime dateAndTime = LocalDateTime.of(1987, 8, 07, 9, 9);
		System.out.println("My birthdate is : "+dateAndTime);
		
		Period period = Period.between(LocalDate.of(1987, 8, 7), LocalDate.now());
		System.out.printf("I am old : %d Years, %d Months and %d Days", period.getYears(), period.getMonths(), period.getDays());
		System.out.println("\n2000 is leap year or not ? "+Year.of(2000).isLeap());
		
		System.out.println("My TimeZone is : "+ZoneId.systemDefault());
		
		ZoneId america = ZoneId.of("America/Los_Angeles");
		System.out.println("Current Time in America : "+ZonedDateTime.now(america));
		
		System.out.println("What would be date after Six month : "+LocalDate.now().plusMonths(6));
		
		
		 Map<Integer, String> map1 = new HashMap<>();
	        map1.put(101, "Rahul");
	        map1.put(103, "Raj");
	        map1.put(106, "Chinna");
	        map1.put(105, "Rahim");

	        Map<String, Double> map2 = new HashMap<>();
	        map2.put("Chinna", 50000.0);
	        map2.put("Rahim", 60000.0);
	        map2.put("Raj", 70000.0);
	        map2.put("Rahul", 20000.0);

	        // Step 1: Sort map2 by values in descending order
	        List<Map.Entry<String, Double>> sortedMap2Entries = map2.entrySet().stream()
	            .sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()))
	            .collect(Collectors.toList());

	        // Step 2: Map keys of map1 to sorted keys of map2
	        Iterator<Map.Entry<String, Double>> sorteditr = sortedMap2Entries.iterator();

	        Map<Integer, Double> result = map1.entrySet().stream()
	            .collect(Collectors.toMap(
	                Map.Entry::getKey,
	                entry -> sorteditr.hasNext() ? sorteditr.next().getValue() : null,
	                (e1, e2) -> e1, // Merge function (not needed here)
	                LinkedHashMap::new // Maintain order
	            ));

	        // Print the result
	        System.out.println(result);
	        
	        int[] intArr = {2, 2, 2, 3, 5, 7, 9, 9};

	        // Use Stream API to find non-duplicate elements
	        List<Integer> nonDuplicates = IntStream.of(intArr)
	                .boxed()
	                .collect(Collectors.groupingBy(e -> e, Collectors.counting())) // Count occurrences
	                .entrySet()
	                .stream()
	                .filter(entry -> entry.getValue() == 1) // Keep only elements with count = 1
	                .map(Map.Entry::getKey) // Extract the key (the number)
	                .collect(Collectors.toList());

	        // Print the result
	        System.out.println(nonDuplicates);
	        
	        
	        String[] input = {"apple", "banana", "orange", "apricot"}; //{a:"appleapricot", b:"banana", o:"orange"}


	        // Use Stream API to group strings by their first character
	        Map<Character, String> groupedStrings = Arrays.stream(input)
	                .collect(Collectors.groupingBy(
	                        str -> str.charAt(0),               // Group by the first character
	                        LinkedHashMap::new,                // Preserve insertion order
	                        Collectors.joining()               // Concatenate strings with the same key
	                ));
		
		
	      //21. Find the longest string from a string array.
			String[] strArr = {"java", "computer", "serialization"};
			String longestWord = Arrays.stream(strArr).reduce((word1, word2)-> word1.length() > word2.length() ? word1:word2).get();
			System.out.println(longestWord);
			
			//22. Get all the numbers from int Array those has started with 1. int[] intArr1 = {12,23,18,20,15};
			int[] intArr1 = {12,23,18,20,15};
			List<String> intStrList = Arrays.stream(intArr1).boxed().map(s -> s+"").filter(s2 -> s2.startsWith("1")).toList();
			System.out.println(intStrList);
			
			//23. String[] str= {1,2,3,4}; print like 1-2-3-4
			String results = String.join("-", strArr);
			System.out.println(results);
 			
		
	

	}



}
