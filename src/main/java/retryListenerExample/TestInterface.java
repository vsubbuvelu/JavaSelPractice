package retryListenerExample;


public interface TestInterface {
	
	
	  default void onTestStart() { System.out.println("output TestInterface"); }
	  
	  
	 
	
	public void tesInt();

}
