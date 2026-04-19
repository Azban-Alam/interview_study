package TestNG;

import org.testng.annotations.Test;

public class invocationTimeOut_attribute {
	@Test(invocationCount = 5, invocationTimeOut = 10000)
	public void invocationTimeOut() {
	    // This method will be run 5 times total.
	    // All 5 invocations must complete within 10 seconds total.
	}
}

