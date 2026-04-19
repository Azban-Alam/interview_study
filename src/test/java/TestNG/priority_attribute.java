package TestNG;

import org.testng.annotations.Test;

public class priority_attribute {
	@Test(priority = 1)
	public void startApp() {
		System.out.println("✅ Launching app");
	}

	@Test(priority = 2)
	public void loginTest() {
		System.out.println("🔐 Logging in");
	}

	@Test(priority = 3)
	public void verifyDashboard() {
		System.out.println("📊 Verifying dashboard");
	}
}