package logicals;

import java.util.Arrays;

public class RotateArray_N_Times {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2; // Number of times to rotate
        
        int[] rotateArray = rotateArray(arr, k);
        System.out.println("Rotated array: " + Arrays.toString(rotateArray));
    }

    public static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // To handle cases where k > n
        if (k == 0) return arr; // No need to rotate if k is 0

        // Create a new array to store the rotated elements
        int[] rotatedArr = new int[n];

        // Copy elements to their new positions
        for (int i = 0; i < n; i++) {
        	rotatedArr[(i + k) % n] = arr[i];
        }
        
        return rotatedArr;

        

	}

}
