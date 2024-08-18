package multiThreading;
//Except wait(), notify() and notifyAll() methods there is no any method where the lock release will happen.
public class DeadlockCondition {
	
	public static void main(String[] args) {
        final Object resource1 = new Object();
        final Object resource2 = new Object();

        // Thread 1 tries to lock resource1 then resource2
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: Locked resource 1");

                    // Adding a delay to ensure that Thread 2 locks resource 2
                    try { Thread.sleep(100); } catch (InterruptedException e) {}

                    synchronized (resource2) {
                        System.out.println("Thread 1: Locked resource 2");
                    }
                }
            }
        });

        // Thread 2 tries to lock resource2 then resource1
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: Locked resource 2");

                    // Adding a delay to ensure that Thread 1 locks resource 1
                    try { Thread.sleep(100); } catch (InterruptedException e) {}

                    synchronized (resource1) {
                        System.out.println("Thread 2: Locked resource 1");
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }

}
