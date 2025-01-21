package logicals;

import java.util.Arrays;

public class RotateArray_N_Times {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		System.out.println("Given array is : "+Arrays.toString(arr));
        int r = 2; // Number of times to rotate
        
        int[] rotateArray = rotateArray(arr, r);
        System.out.println("Rotated array: " + Arrays.toString(rotateArray));
    }

    public static int[] rotateArray(int[] arr, int r) {
        int l = arr.length;
        r = r % l; // To handle cases where r > l
        if (r == 0) return arr; // No need to rotate if r is 0

        // Create a new array to store the rotated elements
        int[] rotatedArr = new int[l];

        // Copy elements to their new positions
        for (int i = 0; i < l; i++) {
        	//rotatedArr[(i + r) % l] = arr[i]; // This is clock(right-to-left) wise rotation.
        	rotatedArr[i] = arr[( i + r ) % l ];// This is anti-clock(left-to-right) wise rotation.
        }
        
        return rotatedArr;

        

	}

}
