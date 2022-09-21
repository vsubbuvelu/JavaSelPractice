package retryListenerExample;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	int count=0,maxRetry = 3;
	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess() && count < maxRetry) {
			count++;
			return true;
		}
		return false;
	}

}
