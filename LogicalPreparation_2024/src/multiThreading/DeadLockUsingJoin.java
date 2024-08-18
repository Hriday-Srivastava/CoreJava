package multiThreading;

public class DeadLockUsingJoin {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		Thread myThread = new Thread(new Runnable() {
			@Override
			public void run() {
				
				for(int i = 0; i < 5; i++) {
					System.out.println("I am from MyThread");
					try {
						mainThread.join();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		
		myThread.start();
		try {
			myThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("I am from Main Thread");
		
	}

}
