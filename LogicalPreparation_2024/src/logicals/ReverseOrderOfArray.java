package logicals;

import java.util.Arrays;

public class ReverseOrderOfArray {

	public static void main(String[] args) {

		// 1st Method
		int[] intArray = { 20, 30, 10, 50, 40, 90, 70 };
		System.out.println("Given Array is : " + Arrays.toString(intArray));

		int temp;
		for (int start = 0, end = intArray.length - 1; start < end; start++, end--) {

			temp = intArray[start];
			intArray[start] = intArray[end];
			intArray[end] = temp;

		}

		System.out.println("The reverse order of above array is : " + Arrays.toString(intArray));

	}

}
