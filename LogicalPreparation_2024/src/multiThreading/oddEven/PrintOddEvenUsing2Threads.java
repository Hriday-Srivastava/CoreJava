package multiThreading.oddEven;

public class PrintOddEvenUsing2Threads {

	public static void main(String[] args) {
		
		Thread oddThread = new Thread(new PrintNumber(), "Odd");
		Thread evenThread = new Thread(new PrintNumber(), "Even");
		
		oddThread.start();
		evenThread.start();

	}

}
