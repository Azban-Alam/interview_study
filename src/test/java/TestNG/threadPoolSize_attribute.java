package TestNG;

import org.testng.annotations.Test;

public class threadPoolSize_attribute {
	@Test(invocationCount = 10, threadPoolSize = 5)
	public void parallelTask() {
	    System.out.println("🧵 Thread: " + Thread.currentThread().getName());
	}
}

