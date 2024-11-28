package logicals;

public class FindPrimeNumber {

	public static void main(String[] args) {
		
		for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // Check if 'num' has any divisor other than 1 and itself
            for (int i = 2; i < num; i++) {
                if (num % i == 0) { // If divisible by any number other than 1 and itself
                    isPrime = false;
                    break; // Exit the loop as 'num' is not prime
                }
            }

            // If 'isPrime' is still true, 'num' is prime
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
	}

}
