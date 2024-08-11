package logicals;

import java.util.Arrays;

public class ReverseOrderOfArray {

	public static void main(String[] args) {
		
		int[] intArray = {20,30,10,50,40,90,70};
		System.out.println("Given Array is : "+Arrays.toString(intArray));
		
		int temp;
		for(int i=0, j=intArray.length-1; i<=j; i++,j--) {
			
			temp = intArray[i];
			intArray[i] = intArray[j];
			intArray[j] = temp;
		}
		System.out.println("The reverse order of above array is : "+Arrays.toString(intArray));

	}

}
