package TestNG.DataProviderFromAnotherClass;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "credentials")
    public static Object[][] getLoginData() {
        return new Object[][] {
            {"admin", "admin123"},
            {"user", "user123"}
        };
    }
}