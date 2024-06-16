package logicals;

import java.util.Arrays;

public class FindThirdLargestNumber {

	public static void main(String[] args) {


		int[] array = {20,23,01,10,5};

		System.out.println("The Given Array  : "+Arrays.toString(array));
		//Logical Style
		int first = array[0];
		int second = array[0];
		int third = 0;

		for(int i : array) {

			if(i > first) {
				second = first;
				first = i;

			}
			else if(i > second) 
				second = i;
			else 
				if(i > third && i < second)
					third = i;



		}
		System.out.println("First Largest : " + first+", Second largest : "+second+", Third Largest : "+third);
		
		//Java 8 Style
		
		int thirdLargest = Arrays.stream(array)
				.boxed() // Convert int to Integer
				.sorted((a, b) -> b.compareTo(a)) // Sort in descending order
				.skip(2) // Skip the first two elements
				.findFirst() // Find the first element
				.orElseThrow(() -> new IllegalArgumentException("Array is too small"));

				
		System.out.println("Third Largest Number is using java8 : "+thirdLargest);


	}

}
