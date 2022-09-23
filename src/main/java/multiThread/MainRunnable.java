package multiThread;

public class MainRunnable {
	
	public static void main(String[] args) {
		UsingRunnable thread = new UsingRunnable();
		Thread th = new Thread(thread);
		th.run();
	}

}
