package multiThreading.oddEven;

public class Odd implements Runnable{

	@Override
	public void run() {
		
		for(int i = 1; i < 11; i++) {
			if(i % 2 != 0)
			System.out.println(i+"\t: Odd Thread");
			Thread.yield();
		}
		
	}

}
