package producerConsumer;

public class Consumer implements Runnable {

	Buffer b ;
	
	public Consumer(Buffer b) {
		super();
		this.b = b;
	}


	@Override
	public void run() {
		System.out.println("Consumer starts consuming ...");
		for(int i = 1; i < 11; i++) {
			b.consume();
		}
		
	}

}
