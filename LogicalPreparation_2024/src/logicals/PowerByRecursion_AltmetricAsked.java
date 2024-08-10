package logicals;

public class PowerByRecursion_AltmetricAsked {

	public static void main(String[] args) {
		
		int resultant = power(3, 3);
		System.out.println(resultant);

	}
	
	public static int power(int base, int powerRaised) {
		if (powerRaised != 0) {

			// recursive call to power()
			return (base * power(base, powerRaised - 1));
		}
		else {
			return 1;
		}
	}


}
