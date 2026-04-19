package TestNG;

import org.testng.annotations.Test;

public class invocationCount_attribute {
	@Test(invocationCount = 5)
	public void repeatedTest() {
	    System.out.println("🔄 Running test again...");
	}
	
}

