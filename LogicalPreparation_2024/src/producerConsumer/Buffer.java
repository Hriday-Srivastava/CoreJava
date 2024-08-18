package producerConsumer;

public class Buffer {

	int a ;
	boolean produced = false;
	
	public synchronized void produce(int x) {
		if(produced) {
			System.out.println("Already Produced. Go and consume first then come to me !");
			try {
				wait();
			}catch(InterruptedException ex) {
				System.out.println(ex);
			}
		}
		a = x;
		System.out.println("Product "+a+ " is produced and need to be consumed");
		produced = true;
		notify();
	}
	
	public synchronized void consume() {
		if(! produced ) {   //Still produced is in false state means product is not ready yet.
			System.out.println("Product is not ready to be consumed so need to wait ....");
			try {
				wait();
			}catch(InterruptedException ex) {
				System.out.println(ex);
			}
		}
		System.out.println("Product "+a+" is consumed. ");
		produced =false;
		notify();
	}
}
