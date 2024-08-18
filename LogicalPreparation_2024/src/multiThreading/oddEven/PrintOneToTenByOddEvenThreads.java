package multiThreading.oddEven;

public class PrintOneToTenByOddEvenThreads {

	public static void main(String[] args) {
		
		Thread oddThread = new Thread(new Odd());
		
		oddThread.start(); // Odd Thread 
		
		//For block is working in main thread and assume main thread is working for Even Thread.
		for(int i = 1; i < 11; i++) {
			if( i%2 == 0)
				System.out.println(i+"\t: Even Thread");
			Thread.yield();
		}

	}
	//If we run multiple time then 1-10 would be printed in sequential.

}
