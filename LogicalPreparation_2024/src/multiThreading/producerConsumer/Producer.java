package multiThreading.producerConsumer;

public class Producer implements Runnable {

	Buffer b;

	public Producer(Buffer b) {
		super();
		this.b = b;
	}

	@Override
	public void run() {
		System.out.println("Producer Starts Producing ...");
		for(int i = 1; i < 11; i++)
			b.produce(i);

	}

}
