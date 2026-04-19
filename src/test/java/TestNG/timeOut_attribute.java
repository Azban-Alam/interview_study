package TestNG;

import org.testng.annotations.Test;

public class timeOut_attribute {
	@Test(timeOut = 3000)
	public void fastMethod() throws InterruptedException {
	    Thread.sleep(2000); // ✅ Will pass: completes within 3 seconds
	}
}

