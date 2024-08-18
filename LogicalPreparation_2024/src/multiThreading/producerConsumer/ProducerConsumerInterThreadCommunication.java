package multiThreading.producerConsumer;

public class ProducerConsumerInterThreadCommunication {

	public static void main(String[] args) {
		
		Buffer b = new Buffer();
		
		//Making of Producer Thread
		Producer producer = new Producer(b);
		Thread producerThread = new Thread(producer);
		
		//Making of Consumer Thread
		Consumer consumer = new Consumer(b);
		Thread consumerThread = new Thread(consumer);
		
		producerThread.start();
		
		consumerThread.start();
		

	}

}
