package TestNG.DataProviderFromAnotherClass;

import org.testng.annotations.Test;

public class LoginTest {

    @Test(dataProvider = "credentials", dataProviderClass = TestData.class)
    public void loginTest(String username, String password) {
        System.out.println("Testing login with: " + username + " / " + password);
    }
}