package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Annotation_DataProvider {

	// This test method receives data from the DataProvider
	@Test(dataProvider = "loginData")
	public void loginTest(String username, String password) {
		System.out.println("Testing login with: " + username + " / " + password);
	}

	// This method supplies data to the test
	@DataProvider(name = "loginData")
	public Object[][] provideData() {
		return new Object[][] { 	
			{ "admin", "admin123" },
			{ "user", "user123" },
			{ "guest", "guest123" }		
		};
	}
	
	// Another DataProvider
	@DataProvider(name = "loginData1", parallel = true, indices = {0, 2})
	public Object[][] provideData1() {
	    return new Object[][] {
	        {"admin", "admin123"},
	        {"user", "user123"},
	        {"guest", "guest123"}
	    };
	}


}