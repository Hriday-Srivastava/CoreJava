package multiThreading.lock;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
	
	ReentrantLock reentrantlock = new ReentrantLock(true);
	public void wish(String name) {
		
		
		
		reentrantlock.lock();
		for(int i=0; i<5; i++) {
			
			System.out.println("Good Morning "+name+" !");
			try {Thread.sleep(2000);}
			catch(InterruptedException ex) {
				
			}
		}
		reentrantlock.unlock();
	}
	

}
