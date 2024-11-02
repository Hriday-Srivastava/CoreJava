package multiThreading.oddEven;

public class PrintNumber implements Runnable{

	public static int i = 1;
	@Override
	public void run() {
		
		while(i <= 100) {
			
			if((i%2 != 0) && Thread.currentThread().getName().equalsIgnoreCase("Odd")) {
				
				System.out.println(i+"\t : \t"+Thread.currentThread().getName()+" Thread");
				i++;
				Thread.yield();
			}
			if((i%2 == 0) && Thread.currentThread().getName().equalsIgnoreCase("Even")) {
				
				System.out.println(i+"\t : \t"+Thread.currentThread().getName()+" Thread");
				i++;
				Thread.yield();
			}
		}
		
	}

}
