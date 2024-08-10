package logicals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(45);list.add(56);list.add(80);list.add(20);
		//Old Approach
		Object[] objectArray = list.toArray();
		
		Integer[] integerArray = new Integer[objectArray.length];
		
		int i=0;
		for(Object obj : objectArray) {
			
			integerArray[i] = (Integer)obj;
			i++;
		}
		System.out.println("Converted List to Array is : "+Arrays.toString(integerArray));
		
		//New approach
		Integer[] integerArray1 = list.toArray(new Integer[0]);//new Integer[0] passed as the parameter. This ensures the returned array is of type Integer[]
		System.out.println("Converted List to Array is : "+Arrays.toString(integerArray1));

	}

}
