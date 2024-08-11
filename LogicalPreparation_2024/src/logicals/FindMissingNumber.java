package logicals;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,5,6,7};
		findMissing(arr);


	}
	
	public static void findMissing(int arr[]) {
		
		System.out.println(Arrays.toString(arr));
		//Find the n
		int n = arr.length+1;
		
		//sum of n
		int sum = n*(n+1)/2;
		
		int elementSum = 0;
		int missing = 0;
		
		for(int i = 0; i<arr.length; i++) {
			elementSum = elementSum + arr[i];
		}
		
		missing = sum - elementSum;
		
		System.out.println("Missing number is : "+missing);
		
		
	}


}
