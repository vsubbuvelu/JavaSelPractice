package retryListenerExample;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersExample implements TestInterface,TestInterface2   {
	
	public static void main(String[] args) {
		ListenersExample p = new ListenersExample();
		p.tesInt();
		p.onTestStart();
	
	}

	@Override
	public void tesInt() {
		System.out.println("impl");
		
	}

	@Override
	public void onTestStart() {
		// TODO Auto-generated method stub
		TestInterface.super.onTestStart();
	}


	
	

}
