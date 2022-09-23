package multiThread;

public class MyThreadMain {
	
	public static void main(String[] args) {
		MyThreadThing thread = new MyThreadThing();
		MyThreadThing thread1 = new MyThreadThing();
		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread1.start();
	}

}
