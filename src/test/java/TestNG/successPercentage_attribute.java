package TestNG;

import org.testng.annotations.Test;

public class successPercentage_attribute {
	@Test(invocationCount = 5, successPercentage = 80)
	public void flakyAPITest() {
	    if (Math.random() < 0.3) {
	        throw new RuntimeException("💥 Simulated failure");
	    }
	    System.out.println("✅ Test passed");
	}
	
}

