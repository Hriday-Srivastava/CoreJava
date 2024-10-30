package multiThreading.lock;

public class ReentrantLockDemo {

	public static void main(String[] args) {
		
		Display d = new Display();
		
		Thread t1 = new Thread(new MyThread(d, "Dhoni")) ;
		Thread t2 = new Thread(new MyThread(d, "Youraj")) ;
		Thread t3 = new Thread(new MyThread(d, "Virat"));
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
