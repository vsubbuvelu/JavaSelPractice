package retryListenerExample;


public interface TestInterface2 {
	
	
	  default void onTestStart() { System.out.println("output"); }
	 
	
	public void tesInt();

}
