package retryListenerExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test01 {
	
	@Test(retryAnalyzer = retryListenerExample.RetryAnalyzer.class)
	public void test() {
		Assert.assertEquals(false, true);
		
	}

}
