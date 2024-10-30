package multiThreading.lock;

public class MyThread implements Runnable{

	Display d;
	String name;
	
	
	public MyThread(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}



	

	@Override
	public void run() {
		d.wish(name);
		
	}

}
